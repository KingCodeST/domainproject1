package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface SportFieldLocationService extends IService<SportFieldLocation,String> {
    Set<SportFieldLocation> getAll();
}
