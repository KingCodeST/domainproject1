package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.LocationRepository;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.service.location.LocationService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class LocationServiceImpl implements LocationService  {

    private static LocationService locationService= null;

    @Autowired
    private LocationRepository campusLocationRepository;

    private LocationServiceImpl() {
    }

    public static LocationService getVehicleService(){
        if (locationService ==null) locationService=new LocationServiceImpl();
        return locationService;
    }

    @Override
    public Location retrieveByDesc(String vehicleDesc) {
        List<Location> campusLocations= getAll();
        for(Location campusRepository: campusLocations)
        {
            if (campusRepository.getResidenceName().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Location> getAll() {
        return this.campusLocationRepository.findAll();
    }

    @Override
    public Location create(Location campusRepository) {

        return this.campusLocationRepository.save(campusRepository);
    }

    @Override
    public Location read(String s) {
        Optional<Location> optVehicle =this.campusLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Location update(Location campusRepository) {
        return this.campusLocationRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.campusLocationRepository.deleteById(s);
    }
}