package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.Location;

import java.util.Set;

public interface LocationRepository extends IRepository<Location,String> {
    Set<Location>getAll();
}
