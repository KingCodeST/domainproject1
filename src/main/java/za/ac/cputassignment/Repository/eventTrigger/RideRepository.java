package za.ac.cputassignment.Repository.eventTrigger;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Set;

public interface RideRepository extends JpaRepository<Ride,String> {

}
