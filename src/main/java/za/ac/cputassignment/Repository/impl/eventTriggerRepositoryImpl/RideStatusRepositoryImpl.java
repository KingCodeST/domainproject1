package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.HashSet;
import java.util.Set;

public class RideStatusRepositoryImpl implements RideStatusRepository {

    private static RideStatusRepositoryImpl repository=null;
    private Set<RideStatus> rideStatuses;

    private RideStatusRepositoryImpl()
    {
        this.rideStatuses =new HashSet<>();
    }


    private RideStatusRepositoryImpl getRepository() {
        if(repository ==null) repository =new RideStatusRepositoryImpl();
        return repository;
    }

    private RideStatus findRide(String rideStatusId)
    {
        return this.rideStatuses.stream().filter(rideStatus -> rideStatus.getId().trim().equals(rideStatusId))
                                .findAny()
                                .orElse(null);
    }



    @Override
    public RideStatus create(RideStatus rideStatus) {
        this.rideStatuses.add(rideStatus);
        return rideStatus;
    }
    @Override
    public RideStatus read(String rideStatusId) {
       RideStatus rideStatus=findRide(rideStatusId);
        return rideStatus;
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        RideStatus rideStatus1 =findRide(rideStatus.getId());
        if(rideStatus1 !=null)
        {
            this.rideStatuses.remove(rideStatus);
            return create(rideStatus);
        }

        return null;
    }

    @Override
    public void delete(String rideStaId) {
        RideStatus rideStatus=findRide(rideStaId);
        if(rideStatus !=null) this.rideStatuses.remove(rideStatus);
    }

    @Override
    public Set<RideStatus> getAll() {
        return this.rideStatuses;

    }


}
