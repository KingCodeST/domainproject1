package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface ResidenceLocationService extends IService<ResidenceLocation,String> {
    Set<ResidenceLocation>getAll();
}
