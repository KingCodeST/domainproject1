package za.ac.cputassignment.Repository.eventTrigger.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTrigger.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.HashSet;
import java.util.Set;


public class RideStatusRepositoryImpl implements RideStatusRepository {

    private static RideStatusRepositoryImpl repository =null;
    private Set<RideStatus> rideset;

    private RideStatusRepositoryImpl(){
        this.rideset =new HashSet<>();
    }

    private RideStatus findArletInfor(String rideId)
    {
        return this.rideset.stream()
                .filter(ride -> ride.getRideStatusId().trim().equals(rideId))
                .findAny()
                .orElse(null);
    }

    public static RideStatusRepositoryImpl getRepository(){
        if(repository ==null) repository=new RideStatusRepositoryImpl();
        return repository;
    }

    @Override
    public Set<RideStatus> getAll() {
        return this.rideset;
    }

    @Override
    public RideStatus create(RideStatus ride) {
        this.rideset.add(ride);
        return ride;
    }

    @Override
    public RideStatus read(String ridestatusId) {
        RideStatus ride=findArletInfor(ridestatusId);
        return ride;
    }

    @Override
    public RideStatus update(RideStatus ride) {
        RideStatus toDelete =findArletInfor(ride.getRideStatusId());
        if(toDelete !=null)
        {
            this.rideset.remove(toDelete);
            return create(ride);
        }
        return null;
    }

    @Override
    public void delete(String ridestatusId) {
        RideStatus ride=findArletInfor(ridestatusId);
        if (ride !=null) this.rideset.remove(ride);

    }
}
