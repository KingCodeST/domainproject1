package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.ResidenceLocation;

import java.util.Set;

public interface ResidenceLocationRepository extends IRepository<ResidenceLocation,String> {
    Set<ResidenceLocation>getAll();
}
