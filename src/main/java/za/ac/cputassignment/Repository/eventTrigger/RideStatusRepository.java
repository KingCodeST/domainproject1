package za.ac.cputassignment.Repository.eventTrigger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;

import java.util.Set;

@Repository("RideStatusRepository")
public interface RideStatusRepository extends JpaRepository<RideStatus,String> {

}
