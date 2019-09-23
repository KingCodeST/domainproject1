package za.ac.cputassignment.Repository.eventTrigger;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.Set;

public interface RideStatusRepository extends IRepository<RideStatus,String> {
    Set<RideStatus> getAll();
}
