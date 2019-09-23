package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.transport.VanVehicleService;

import java.util.Set;

@Repository("InMemory")
public class VanVehicleRepositoryImpl implements VanVehicleService {
    @Override
    public Set<VanVehicle> getAll() {
        return null;
    }

    @Override
    public VanVehicle create(VanVehicle vanVehicle) {
        return null;
    }

    @Override
    public VanVehicle read(String s) {
        return null;
    }

    @Override
    public VanVehicle update(VanVehicle vanVehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
