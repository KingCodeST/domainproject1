package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideService;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.List;
import java.util.Set;


public class RideStatusServiceImpl implements RideStatusService {


    @Override
    public RideStatus retrieveByDesc(String rideStatusDesc) {
        return null;
    }

    @Override
    public List<RideStatus> getAll() {
        return null;
    }

    @Override
    public RideStatus create(RideStatus rideStatus) {
        return null;
    }

    @Override
    public RideStatus read(String s) {
        return null;
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}