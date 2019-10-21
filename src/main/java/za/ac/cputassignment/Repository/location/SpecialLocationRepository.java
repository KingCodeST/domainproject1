package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.Set;

@Repository("SpecialLocationRepository")
public interface SpecialLocationRepository extends JpaRepository<SpecialLocation,String> {

}
