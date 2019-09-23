package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.SportFieldLocation;

import java.util.Set;

public interface SportFieldLocationRepository extends IRepository<SportFieldLocation,String> {
    Set<SportFieldLocation>getAll();
}
