package za.ac.cputassignment.service.eventTrigger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;

import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;
import za.ac.cputassignment.service.eventTrigger.RideStatusService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class RideStatusServiceImpl implements RideStatusService {

    private static  RideStatusService rideStatusService= null;

    @Autowired
    private RideStatusRepository ridestatusRepository;

    private RideStatusServiceImpl() {
    }

    public static RideStatusService getVehicleService(){
        if (rideStatusService ==null) rideStatusService=new RideStatusServiceImpl();
        return rideStatusService;
    }


    public RideStatus retrieveByDesc(boolean statusDesc) {
        List<RideStatus> statuss= getAll();
        for(RideStatus status: statuss)
        {
           // if (status.isOn(statusDesc))
                return  status;
        }
        return null;
    }

    @Override
    public RideStatus retrieveByDesc(String rideStatusDesc) {
        return null;
    }

    @Override
    public List<RideStatus> getAll() {
        return this.ridestatusRepository.findAll();
    }

    @Override
    public RideStatus create(RideStatus status) {

        return this.ridestatusRepository.save(status);
    }

    @Override
    public RideStatus read(String s) {
        Optional<RideStatus> optRideStatus =this.ridestatusRepository.findById(s);
        return optRideStatus.orElse(null);
    }

    @Override
    public RideStatus update(RideStatus status) {
        return this.ridestatusRepository.save(status);
    }

    @Override
    public void delete(String s) {
        this.ridestatusRepository.deleteById(s);
    }}