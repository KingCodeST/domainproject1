package za.ac.cputassignment.Repository.eventTrigger;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Set;

public interface RideRepository extends IRepository<Ride,String> {
    Set<Ride>getAll();
}
