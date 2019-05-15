package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.eventTriggerRepository.RideStatusRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.*;
@Repository("InMemory")
public class RideStatusRepositoryImpl implements RideStatusRepository {

    private static RideStatusRepositoryImpl repository=null;
    private Map<String,RideStatus> rideStatuses;

    private RideStatusRepositoryImpl()
    {
        this.rideStatuses =new HashMap<>();
    }


    public static RideStatusRepositoryImpl getRepository() {
        if(repository ==null) repository =new RideStatusRepositoryImpl();
        return repository;
    }





    @Override
    public RideStatus create(RideStatus rideStatus) {
       this.rideStatuses.put(rideStatus.getId(),rideStatus);
       return rideStatus;
    }
    @Override
    public RideStatus read(String rideStatusId) {
       return this.rideStatuses.get(rideStatusId);
    }

    @Override
    public RideStatus update(RideStatus rideStatus) {
        this.rideStatuses.replace(rideStatus.getId(),rideStatus);
        return this.rideStatuses.get(rideStatus.getId());
    }

    @Override
    public void delete(String rideStaId) {
      this.rideStatuses.remove(rideStaId);
    }

    @Override
    public Set<RideStatus> getAll() {
        Collection<RideStatus> rideStatuses=this.rideStatuses.values();
        Set<RideStatus> set =new HashSet<>();
        set.addAll(rideStatuses);
        return set;

    }


}
