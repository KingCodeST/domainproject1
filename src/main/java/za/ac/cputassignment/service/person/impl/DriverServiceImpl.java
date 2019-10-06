package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverRepository;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.service.person.DriverService;

import java.util.List;
import java.util.Set;


public class DriverServiceImpl implements DriverService {


    @Override
    public Driver retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Driver> getAll() {
        return null;
    }

    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver read(String s) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

