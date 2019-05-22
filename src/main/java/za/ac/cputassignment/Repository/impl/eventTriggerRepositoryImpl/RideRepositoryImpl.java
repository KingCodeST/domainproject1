 package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.*;

@Repository("InMemory")
public class RideRepositoryImpl implements RideRepository {

    private static RideRepositoryImpl repository=null;
    private Map<String,Ride> rides;

    private RideRepositoryImpl()
    {
        this.rides =new HashMap<>();
    }


    public static RideRepositoryImpl getRepository()
    {
        if(repository == null) repository =new RideRepositoryImpl();
        return repository;
    }


    @Override
    public Ride create(Ride ride) {
        this.rides.put(ride.getId(),ride);
        return ride;
    }

    @Override
    public Ride read(String RideId) {
        return this.rides.get(RideId);

    }

    @Override
    public Ride update(Ride ride) {
        this.rides.replace(ride.getId(),ride);
        return this.rides.get(ride.getId());
    }

    @Override
    public void delete(String RideId) {
        this.rides.remove(RideId);

    }


    @Override
    public Set<Ride> getAll() {
        Collection<Ride> rides=this.rides.values();
        Set<Ride> set =new HashSet<>();
        set.addAll(rides);
        return set;
    }
}


