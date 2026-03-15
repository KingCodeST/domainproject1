package za.ac.cputassignment.service.transport.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.transport.VehicleRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.transport.VehicleService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    private static final Logger logger = LoggerFactory.getLogger(VehicleServiceImpl.class);

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle retrieveByDesc(String vehicleType) {
        logger.debug("Retrieving vehicle by type: {}", vehicleType);
        Optional<Vehicle> vehicle = vehicleRepository.findByTypeVehicle(vehicleType);
        if (vehicle.isEmpty()) {
            logger.warn("Vehicle not found with type: {}", vehicleType);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Vehicle not found with type: " + vehicleType
            );
        }
        return vehicle.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vehicle> getAll() {
        logger.debug("Fetching all vehicles");
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        if (vehicle == null) {
            logger.error("Cannot create null vehicle");
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        logger.info("Creating new vehicle: {}", vehicle.getVehicleId());
        return vehicleRepository.save(vehicle);
    }

    @Override
    @Transactional(readOnly = true)
    public Vehicle read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Vehicle ID cannot be null or empty");
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
        }
        logger.debug("Reading vehicle with id: {}", id);
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException(
                        "Vehicle not found with id: " + id
                ));
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        if (vehicle == null || vehicle.getId() == null) {
            logger.error("Cannot update null vehicle or vehicle without ID");
            throw new IllegalArgumentException("Vehicle and ID cannot be null");
        }
        logger.info("Updating vehicle with id: {}", vehicle.getId());
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Vehicle ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
        }
        logger.info("Deleting vehicle with id: {}", id);
        vehicleRepository.deleteById(id);
    }
}

