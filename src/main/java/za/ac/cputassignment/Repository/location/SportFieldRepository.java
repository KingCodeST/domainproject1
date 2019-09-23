package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SportField;

import java.util.Set;

public interface SportFieldRepository extends IRepository<SportField,String> {
    Set<SportField>getAll();
}
