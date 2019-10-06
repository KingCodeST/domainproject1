package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SportFieldLocation;

import java.util.Set;

public interface SportFieldLocationRepository extends JpaRepository<SportFieldLocation,String> {

}
