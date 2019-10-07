package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverLicenseRepository;

import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.service.person.DriverLicenseService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class DriverLicenseServiceImpl implements DriverLicenseService {

    private static DriverLicenseService driverLicenseService= null;

    @Autowired
    private DriverLicenseRepository driverLicenseRepository;

    private DriverLicenseServiceImpl() {
    }

    public static DriverLicenseService getVehicleService(){
        if (driverLicenseService ==null) driverLicenseService=new DriverLicenseServiceImpl();
        return driverLicenseService;
    }

    @Override
    public DriverLicense retrieveByDesc(String vehicleDesc) {
        List<DriverLicense> campusLocations= getAll();
        for(DriverLicense campusRepository: campusLocations)
        {
            if (campusRepository.getCode().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<DriverLicense> getAll() {
        return this.driverLicenseRepository.findAll();
    }

    @Override
    public DriverLicense create(DriverLicense campusRepository) {

        return this.driverLicenseRepository.save(campusRepository);
    }

    @Override
    public DriverLicense read(String s) {
        Optional<DriverLicense> optVehicle =this.driverLicenseRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public DriverLicense update(DriverLicense campusRepository) {
        return this.driverLicenseRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.driverLicenseRepository.deleteById(s);
    }

}

