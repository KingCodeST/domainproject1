package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.Repository.person.impl.DriverRepositoryImpl;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.person.DriverService;

import java.util.Set;


public class DriverServiceImpl implements DriverService {


    private static DriverServiceImpl service=null;
    private DriverRepository repository;

    private DriverServiceImpl(){
        this.repository = DriverRepositoryImpl.getRepository();
    }

    public static DriverServiceImpl getService(){
        if(service ==null) service =new DriverServiceImpl();
        return service;
    }



    @Override
    public Set<Driver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Driver create(Driver objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public Driver read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Driver update(Driver objectEntity) {
        return this.repository.update(objectEntity);
    }
    
    public Driver retrieveByDesc(String colors) {
        Set<Driver> drivers = getAll();
        for (Driver driver : drivers) {
            if (driver.getDriverLastName().equalsIgnoreCase(colors)) return driver;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

