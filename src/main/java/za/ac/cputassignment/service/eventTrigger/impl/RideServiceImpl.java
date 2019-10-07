package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;

import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideService;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class RideServiceImpl implements RideService {

    private static  RideService rideService= null;

    @Autowired
    private RideRepository rideRepository;

    private RideServiceImpl() {
    }

    public static RideService getVehicleService(){
        if (rideService ==null) rideService=new RideServiceImpl();
        return rideService;
    }

    @Override
    public Ride retrieveByDesc(String vehicleDesc) {
        List<Ride> rides= getAll();
        for(Ride ride: rides)
        {
            if (ride.getNameTrip().equalsIgnoreCase(vehicleDesc))
                return  ride;
        }
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return this.rideRepository.findAll();
    }

    @Override
    public Ride create(Ride ride) {

        return this.rideRepository.save(ride);
    }

    @Override
    public Ride read(String s) {
        Optional<Ride> optVehicle =this.rideRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Ride update(Ride ride) {
        return this.rideRepository.save(ride);
    }

    @Override
    public void delete(String s) {
        this.rideRepository.deleteById(s);
    }
}