package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.Set;

public interface SpecialLocationRepository extends IRepository<SpecialLocation,String> {
    Set<SpecialLocation>getAll();
}
