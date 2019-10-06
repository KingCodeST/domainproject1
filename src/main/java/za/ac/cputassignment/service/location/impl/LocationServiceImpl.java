package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.LocationRepository;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.service.location.LocationService;

import java.util.List;
import java.util.Set;


public class LocationServiceImpl implements LocationService  {


    @Override
    public Location retrieveByDesc(String locationDesc) {
        return null;
    }

    @Override
    public List<Location> getAll() {
        return null;
    }

    @Override
    public Location create(Location location) {
        return null;
    }

    @Override
    public Location read(String s) {
        return null;
    }

    @Override
    public Location update(Location location) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}