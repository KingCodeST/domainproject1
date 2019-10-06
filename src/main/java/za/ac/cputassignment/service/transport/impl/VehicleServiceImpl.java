package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VehicleRepository;

import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.transport.VehicleService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class VehicleServiceImpl implements VehicleService  {

    private static  VehicleService vehicleService= null;

    @Autowired
    private VehicleRepository vehicleRepository;

    private VehicleServiceImpl() {
    }

    public static VehicleService getVehicleService(){
        if (vehicleService ==null) vehicleService=new VehicleServiceImpl();
        return vehicleService;
    }

    @Override
    public Vehicle retrieveByDesc(String vehicleDesc) {
        List<Vehicle> vehicles= getAll();
        for(Vehicle vehicle: vehicles)
        {
            if (vehicle.getTypeVehicle().equalsIgnoreCase(vehicleDesc))
                return  vehicle;
        }
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        return this.vehicleRepository.findAll();
    }

    @Override
    public Vehicle create(Vehicle vehicle) {

        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle read(String s) {
        Optional<Vehicle> optVehicle =this.vehicleRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(String s) {
        this.vehicleRepository.deleteById(s);
    }
}

