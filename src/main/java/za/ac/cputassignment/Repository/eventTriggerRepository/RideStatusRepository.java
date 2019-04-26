package za.ac.cputassignment.Repository.eventTriggerRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.Set;

public interface RideStatusRepository extends IRepository<RideStatus,String> {
    Set<RideStatus>getAll();

}
