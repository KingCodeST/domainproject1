package za.ac.cputassignment.Repository.LocationRepository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Set;

public interface SportFieldRepository extends CrudRepository<SportField,String> {

}
