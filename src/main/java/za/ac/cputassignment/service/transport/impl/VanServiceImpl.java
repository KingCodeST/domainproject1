package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanRepository;

import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.transport.VanService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class VanServiceImpl implements VanService  {

    private static VanService vanService= null;

    @Autowired
    private VanRepository vanRepository;

    private VanServiceImpl() {
    }

    public static VanService getVehicleService(){
        if (vanService ==null) vanService=new VanServiceImpl();
        return vanService;
    }

    @Override
    public Van retrieveByDesc(String vehicleDesc) {
        List<Van> campusLocations= getAll();
        for(Van campusRepository: campusLocations)
        {
            if (campusRepository.getNumPlate().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Van> getAll() {
        return this.vanRepository.findAll();
    }

    @Override
    public Van create(Van campusRepository) {

        return this.vanRepository.save(campusRepository);
    }

    @Override
    public Van read(String s) {
        Optional<Van> optVehicle =this.vanRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Van update(Van campusRepository) {
        return this.vanRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.vanRepository.deleteById(s);
    }

}

