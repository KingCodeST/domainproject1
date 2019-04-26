package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Set;

public class RideRepositoryImpl implements RideRepository {

    private static RideRepositoryImpl repository=null;
    private Set<Ride> rides;


    private RideRepositoryImpl getRepository( )
    {
        if(repository == null) repository =new RideRepositoryImpl();
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
    public Ride update(Ride ride) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Ride read(String s) {
        return null;
    }
}
