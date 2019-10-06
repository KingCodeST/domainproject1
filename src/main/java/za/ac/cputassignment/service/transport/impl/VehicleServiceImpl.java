package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VehicleRepository;

import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.transport.VehicleService;

import java.util.List;
import java.util.Set;


public class VehicleServiceImpl implements VehicleService  {


    @Override
    public Vehicle retrieveByDesc(String vehicleDesc) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle read(String s) {
        return null;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

