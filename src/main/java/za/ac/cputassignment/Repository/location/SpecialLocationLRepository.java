package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SpecialLocationL;

import java.util.Set;

@Repository("SpecialLocationLRepository")
public interface SpecialLocationLRepository extends JpaRepository<SpecialLocationL,String> {

}
