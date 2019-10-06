package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface CampusLocationService extends IService<CampusLocation,String>{
    CampusLocation retrieveByDesc(String clocationDesc);
    List<CampusLocation> getAll();
}
