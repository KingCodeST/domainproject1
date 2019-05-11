package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Set;

public class RideRepositoryImpl implements RideRepository {

    private static RideRepositoryImpl repository=null;
    private Set<Ride> rides;

    private Ride findRide(String Rideid){
        return this.rides.stream()
                         .filter(ride -> ride.getId().trim().equals(Rideid))
                        .findAny()
                        .orElse(null);
    }

    private RideRepositoryImpl getRepository( )
    {
        if(repository == null) repository =new RideRepositoryImpl();
        return repository;
    }







    @Override
    public Ride create(Ride ride) {
        this.rides.add(ride);
        return ride;
    }

    @Override
    public Ride read(String RideId) {
        Ride ride=findRide(RideId);
        return ride;
    }

    @Override
    public Ride update(Ride ride) {
        Ride toDelete =findRide(ride.getId());
        if(toDelete !=null)
        {
            this.rides.remove(toDelete);
            return create(ride);
        }
        return null;
    }

    @Override
    public void delete(String RideId) {
        Ride ride =findRide(RideId);
        if(ride !=null) this.rides.remove(ride);

    }


    @Override
    public Set<Ride> getAll() {
        return this.rides;
    }
}
