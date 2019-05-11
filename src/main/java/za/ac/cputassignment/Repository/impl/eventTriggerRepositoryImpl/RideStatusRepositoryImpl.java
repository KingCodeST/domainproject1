package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.Set;

public class RideStatusRepositoryImpl implements RideStatusRepository {

    private static RideRepositoryImpl repository=null;
    private Set<RideStatus> rideStatuses;


    private RideRepositoryImpl getRepository() {
        if(repository ==null) repository =new RideRepositoryImpl();
        return repository;
    }

    private RideStatus findRide(String rideStatusId)
    {
        return this.rideStatuses.stream().filter(rideStatus -> rideStatus.getId().trim().equals(rideStatusId))
                                .findAny()
                                .orElse(null);
    }

    @Override
    public Set<RideStatus> getAll() {
        return this.rideStatuses;
    }

    @Override
    public RideStatus create(RideStatus rideStatus) {
        this.rideStatuses.add(rideStatus);
        return rideStatus;
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public RideStatus read(String s) {
        return null;
    }
}
