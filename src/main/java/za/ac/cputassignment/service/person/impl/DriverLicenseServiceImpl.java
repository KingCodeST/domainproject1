package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverLicenseRepository;
import za.ac.cputassignment.Repository.person.impl.DriverLicenseRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.service.person.DriverLicenseService;

import java.util.Set;


public class DriverLicenseServiceImpl implements DriverLicenseService {



    private static DriverLicenseServiceImpl service=null;
    private DriverLicenseRepository repository;

    private DriverLicenseServiceImpl(){
        this.repository = DriverLicenseRepositoryImpl.getRepository();
    }

    public static DriverLicenseServiceImpl getService(){
        if(service ==null) service =new DriverLicenseServiceImpl();
        return service;
    }



    @Override
    public Set<DriverLicense> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DriverLicense create(DriverLicense objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public DriverLicense read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DriverLicense update(DriverLicense objectEntity) {
        return this.repository.update(objectEntity);
    }

    public DriverLicense retrieveByDesc(String colors) {
        Set<DriverLicense> driverLicense = getAll();
        for (DriverLicense driverLicenses : driverLicense) {
            if (driverLicenses.getCode().equalsIgnoreCase(colors)) return driverLicenses;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

