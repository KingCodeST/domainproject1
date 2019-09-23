package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface LocationService extends IService<Location,String> {
    Set<Location> getAll();
}
