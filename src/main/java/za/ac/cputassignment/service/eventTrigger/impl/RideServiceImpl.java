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
import java.util.Set;


public class RideServiceImpl implements RideService {


    @Override
    public Ride retrieveByDesc(String rideDesc) {
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return null;
    }

    @Override
    public Ride create(Ride ride) {
        return null;
    }

    @Override
    public Ride read(String s) {
        return null;
    }

    @Override
    public Ride update(Ride ride) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}