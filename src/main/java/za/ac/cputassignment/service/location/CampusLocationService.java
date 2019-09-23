package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface CampusLocationService extends IService<CampusLocation,String>{
    Set<CampusLocation>getAll();
}
