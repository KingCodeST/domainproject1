package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.Set;

public interface CampusLocationRepository extends IRepository<CampusLocation,String> {
    Set<CampusLocation>getAll();
}
