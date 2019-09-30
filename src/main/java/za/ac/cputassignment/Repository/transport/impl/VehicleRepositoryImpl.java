package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.transport.VehicleService;

import java.util.HashSet;
import java.util.Set;


public class VehicleRepositoryImpl implements VehicleService {

    private static VehicleRepositoryImpl repository = null;
    private Set<Vehicle> vehicleSet;

    private VehicleRepositoryImpl() {
        this.vehicleSet = new HashSet<>();
    }

    private Vehicle findVanVehicle(String busId) {
        return this.vehicleSet.stream()
                .filter(driverBus -> driverBus.getVehicleId().trim().equals(busId))
                .findAny()
                .orElse(null);
    }

    public static VehicleRepositoryImpl getRepository() {
        if (repository == null) repository = new VehicleRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.vehicleSet;
    }

    @Override
    public Vehicle create(Vehicle vehicleObj) {
        this.vehicleSet.add(vehicleObj);
        return vehicleObj;
    }

    @Override
    public Vehicle read(String residenceLocationID) {
        Vehicle vehicleObj = findVanVehicle(residenceLocationID);
        return vehicleObj;
    }

    @Override
    public Vehicle update(Vehicle vehicleObj) {
        Vehicle toDelete = findVanVehicle(vehicleObj.getVehicleId());
        if (toDelete != null) {
            this.vehicleSet.remove(toDelete);
            return create(vehicleObj);
        }
        return null;
    }

    @Override
    public void delete(String busId) {
        Vehicle vehicleObj = findVanVehicle(busId);
        if (vehicleObj != null) this.vehicleSet.remove(vehicleObj);

    }
}
