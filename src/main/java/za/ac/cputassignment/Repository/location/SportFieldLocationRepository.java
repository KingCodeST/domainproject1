package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SportFieldLocation;

import java.util.Set;

@Repository("SportFieldLocationRepository")
public interface SportFieldLocationRepository extends JpaRepository<SportFieldLocation,String> {

}
