package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VehicleRepository;
import za.ac.cputassignment.Repository.transport.impl.VehicleRepositoryImpl;
import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.service.transport.VehicleService;

import java.util.Set;


public class VehicleServiceImpl implements VehicleService {


    private static VehicleServiceImpl  service=null;
    private VehicleRepository repository;

    private VehicleServiceImpl (){
        this.repository = (VehicleRepository) VehicleRepositoryImpl.getRepository();
    }

    public static VehicleServiceImpl  getService(){
        if(service ==null) service =new VehicleServiceImpl ();
        return service;
    }



    @Override
    public Set<Vehicle> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Vehicle create(Vehicle objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Vehicle read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Vehicle update(Vehicle objectEntity) {
        return this.repository.update(objectEntity);
    }

    public Vehicle retrieveByDesc(String colors) {
        Set<Vehicle> vehicles = getAll();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeVehicle().equalsIgnoreCase(colors)) return vehicle;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

