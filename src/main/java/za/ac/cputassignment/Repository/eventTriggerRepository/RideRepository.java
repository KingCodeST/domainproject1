package za.ac.cputassignment.Repository.eventTriggerRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Set;

public interface RideRepository extends IRepository<Ride,String> {
    Set<Ride>getAll();
}
