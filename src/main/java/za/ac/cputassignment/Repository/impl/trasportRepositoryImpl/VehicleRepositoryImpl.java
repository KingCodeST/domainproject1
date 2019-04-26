package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.trasportRepository.VehicleRepository;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class VehicleRepositoryImpl implements VehicleRepository {

    private static VehicleRepositoryImpl repository=null;
    private Set<Vehicle> vehicles;

    private VehicleRepositoryImpl()
    {
        this.vehicles =new HashSet<>();
    }

    public static VehicleRepository getRepository()
    {
        if(repository ==null) repository =new VehicleRepositoryImpl();
        return  repository;
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.vehicles;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Vehicle read(String s) {
        return null;
    }
}
