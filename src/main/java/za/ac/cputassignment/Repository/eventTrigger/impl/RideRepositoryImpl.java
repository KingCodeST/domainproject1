package za.ac.cputassignment.Repository.eventTrigger.impl;


import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.HashSet;
import java.util.Set;


public class RideRepositoryImpl implements RideRepository {
    
    private static RideRepositoryImpl repository =null;
    private Set<Ride> rides;

    private RideRepositoryImpl(){
        this.rides =new HashSet<>();
    }

    private Ride findArletInfor(String rideId)
    {
        return this.rides.stream()
                .filter(ride -> ride.getRideNumber().trim().equals(rideId))
                .findAny()
                .orElse(null);
    }

    public static RideRepositoryImpl getRepository(){
        if(repository ==null) repository=new RideRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Ride> getAll() {
        return this.rides;
    }

    @Override
    public Ride create(Ride ride) {
        this.rides.add(ride);
        return ride;
    }

    @Override
    public Ride read(String alertInforId) {
        Ride ride=findArletInfor(alertInforId);
        return ride;
    }

    @Override
    public Ride update(Ride ride) {
        Ride toDelete =findArletInfor(ride.getRideNumber());
        if(toDelete !=null)
        {
            this.rides.remove(toDelete);
            return create(ride);
        }
        return null;
    }

    @Override
    public void delete(String alertInforId) {
        Ride ride=findArletInfor(alertInforId);
        if (ride !=null) this.rides.remove(ride);

    }
}
