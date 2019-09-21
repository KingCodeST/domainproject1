package za.ac.cputassignment.Repository.LocationRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import java.util.Set;

public interface LocationInforRepository extends IRepository<CampusLocation,String> {

    Set<CampusLocation>getAll();
}
