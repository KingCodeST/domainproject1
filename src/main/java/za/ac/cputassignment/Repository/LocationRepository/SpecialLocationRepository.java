package za.ac.cputassignment.Repository.LocationRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.Set;

public interface SpecialLocationRepository extends IRepository<SpecialLocation,String> {
    Set<SpecialLocation>getAll();
}
