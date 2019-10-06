package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverLicenseRepository;

import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.service.person.DriverLicenseService;

import java.util.List;
import java.util.Set;


public class DriverLicenseServiceImpl implements DriverLicenseService {


    @Override
    public DriverLicense retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<DriverLicense> getAll() {
        return null;
    }

    @Override
    public DriverLicense create(DriverLicense driverLicense) {
        return null;
    }

    @Override
    public DriverLicense read(String s) {
        return null;
    }

    @Override
    public DriverLicense update(DriverLicense driverLicense) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

