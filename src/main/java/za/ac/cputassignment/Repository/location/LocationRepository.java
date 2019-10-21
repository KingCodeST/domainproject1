package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.Location;

import java.util.Set;

@Repository("LocationRepository")
public interface LocationRepository extends JpaRepository<Location,String> {

}
