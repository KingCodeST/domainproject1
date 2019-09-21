package za.ac.cputassignment.service.service.LocationService;

import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface LocationInforService extends IService<CampusLocation,String> {
    Set<CampusLocation> getAll();
}
