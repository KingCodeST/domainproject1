package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface SpecialLocationService extends IService<SpecialLocation,String> {
    Set<SpecialLocation>getAll();
}
