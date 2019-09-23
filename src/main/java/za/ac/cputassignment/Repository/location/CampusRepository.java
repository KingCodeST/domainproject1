package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.Campus;

import java.util.Set;

public interface CampusRepository extends IRepository<Campus,String> {
    Set<Campus>getAll();
}
