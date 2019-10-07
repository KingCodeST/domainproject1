package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverRepository;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.person.DriverService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class DriverServiceImpl implements DriverService {

    private static DriverService driverService= null;

    @Autowired
    private DriverRepository driverRepository;

    private DriverServiceImpl() {
    }

    public static DriverService getVehicleService(){
        if (driverService ==null) driverService=new DriverServiceImpl();
        return driverService;
    }

    @Override
    public Driver retrieveByDesc(String vehicleDesc) {
        List<Driver> campusLocations= getAll();
        for(Driver campusRepository: campusLocations)
        {
            if (campusRepository.getLicanseCode().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Driver> getAll() {
        return this.driverRepository.findAll();
    }

    @Override
    public Driver create(Driver campusRepository) {

        return this.driverRepository.save(campusRepository);
    }

    @Override
    public Driver read(String s) {
        Optional<Driver> optVehicle =this.driverRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Driver update(Driver campusRepository) {
        return this.driverRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.driverRepository.deleteById(s);
    }

}

