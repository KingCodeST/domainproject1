package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanVehicleRepository;

import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.transport.VanVehicleService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class VanVehicleServiceImpl implements VanVehicleService {

    private static VanVehicleService vanVehicleService= null;

    @Autowired
    private VanVehicleRepository vanVehicleRepository;

    private VanVehicleServiceImpl() {
    }

    public static VanVehicleService getVehicleService(){
        if (vanVehicleService ==null) vanVehicleService=new VanVehicleServiceImpl();
        return vanVehicleService;
    }

    @Override
    public VanVehicle retrieveByDesc(String vehicleDesc) {
        List<VanVehicle> campusLocations= getAll();
        for(VanVehicle campusRepository: campusLocations)
        {
            if (campusRepository.getVehicleVan().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<VanVehicle> getAll() {
        return this.vanVehicleRepository.findAll();
    }

    @Override
    public VanVehicle create(VanVehicle campusRepository) {

        return this.vanVehicleRepository.save(campusRepository);
    }

    @Override
    public VanVehicle read(String s) {
        Optional<VanVehicle> optVehicle =this.vanVehicleRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public VanVehicle update(VanVehicle campusRepository) {
        return this.vanVehicleRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.vanVehicleRepository.deleteById(s);
    }

}

