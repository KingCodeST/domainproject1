package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.Repository.eventTrigger.impl.RideRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideService;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.Set;


public class RideServiceImpl implements RideService {


    private static RideServiceImpl service=null;
    private RideRepository repository;

    private RideServiceImpl(){
        this.repository = RideRepositoryImpl.getRepository();
    }

    public static RideServiceImpl getService(){
        if(service ==null) service =new RideServiceImpl();
        return service;
    }



    @Override
    public Set<Ride> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Ride create(Ride ride) {

        return this.repository.create(ride);
    }

    @Override
    public Ride read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Ride update(Ride ride) {
        return this.repository.update(ride);
    }

    public Ride retrieveByDesc(String colors) {
        Set<Ride> rides = getAll();
        for (Ride ride : rides) {
            if (ride.getRideNumber().equalsIgnoreCase(colors)) return ride;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}