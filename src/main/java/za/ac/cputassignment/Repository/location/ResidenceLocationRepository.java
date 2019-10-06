package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.ResidenceLocation;

import java.util.Set;

public interface ResidenceLocationRepository extends JpaRepository<ResidenceLocation,String> {

}
