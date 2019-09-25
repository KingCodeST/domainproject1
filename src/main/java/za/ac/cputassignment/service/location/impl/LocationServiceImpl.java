package za.ac.cputassignment.service.location.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.LocationRepository;
import za.ac.cputassignment.Repository.location.impl.LocationRepositoryImpl;
import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.service.location.LocationService;

import java.util.Set;

@Service("serviceImpl")
public class LocationServiceImpl implements LocationService {


    private static LocationServiceImpl service=null;
    private LocationRepository repository;

    private LocationServiceImpl(){
        this.repository = LocationRepositoryImpl.getRepository();
    }

    public static LocationServiceImpl getService(){
        if(service ==null) service =new LocationServiceImpl();
        return service;
    }



    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Location create(Location location) {

        return this.repository.create(location);
    }

    @Override
    public Location read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Location update(Location location) {
        return this.repository.update(location);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}