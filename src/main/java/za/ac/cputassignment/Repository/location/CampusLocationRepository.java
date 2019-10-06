package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.Set;

public interface CampusLocationRepository extends JpaRepository<CampusLocation,String> {

}
