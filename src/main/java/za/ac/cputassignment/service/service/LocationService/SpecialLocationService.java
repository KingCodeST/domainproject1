package za.ac.cputassignment.service.service.LocationService;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface SpecialLocationService extends IService<SpecialLocation,String> {
    Set<SpecialLocation> getAll();
}
