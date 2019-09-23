package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SpecialLocationL;

import java.util.Set;

public interface SpecialLocationLRepository extends IRepository<SpecialLocationL,String> {
    Set<SpecialLocationL>getAll();
}
