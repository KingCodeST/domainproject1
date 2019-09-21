package za.ac.cputassignment.Repository.LocationRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Set;

public interface SportFieldRepository extends IRepository<SportField,String> {
    Set<SportField> getAll();
}
