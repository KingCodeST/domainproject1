package za.ac.cputassignment.service.eventTrigger.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.service.eventTrigger.RideService;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RideServiceImpl implements RideService {

    private static final Logger logger = LoggerFactory.getLogger(RideServiceImpl.class);

    @Autowired
    private RideRepository rideRepository;

    @Override
    public Ride retrieveByDesc(String tripName) {
        logger.debug("Retrieving ride by trip name: {}", tripName);
        Optional<Ride> ride = rideRepository.findByNameTrip(tripName);
        if (ride.isEmpty()) {
            logger.warn("Ride not found with trip name: {}", tripName);
            throw new GlobalExceptionHandler.ResourceNotFoundException(
                    "Ride not found with trip name: " + tripName
            );
        }
        return ride.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ride> getAll() {
        logger.debug("Fetching all rides");
        return rideRepository.findAll();
    }

    @Override
    public Ride create(Ride ride) {
        if (ride == null) {
            logger.error("Cannot create null ride");
            throw new IllegalArgumentException("Ride cannot be null");
        }
        logger.info("Creating new ride: {}", ride.getRideNumber());
        return rideRepository.save(ride);
    }

    @Override
    @Transactional(readOnly = true)
    public Ride read(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Ride ID cannot be null or empty");
            throw new IllegalArgumentException("Ride ID cannot be null or empty");
        }
        logger.debug("Reading ride with id: {}", id);
        return rideRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException(
                        "Ride not found with id: " + id
                ));
    }

    @Override
    public Ride update(Ride ride) {
        if (ride == null || ride.getId() == null) {
            logger.error("Cannot update null ride or ride without ID");
            throw new IllegalArgumentException("Ride and ID cannot be null");
        }
        logger.info("Updating ride with id: {}", ride.getId());
        return rideRepository.save(ride);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("Ride ID cannot be null or empty for deletion");
            throw new IllegalArgumentException("Ride ID cannot be null or empty");
        }
        logger.info("Deleting ride with id: {}", id);
        rideRepository.deleteById(id);
    }
}