package za.ac.cputassignment.Repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Set;

@Repository("SportFieldRepository")
public interface SportFieldRepository extends JpaRepository<SportField,String> {

}
