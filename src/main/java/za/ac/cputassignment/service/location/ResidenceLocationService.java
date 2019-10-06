package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface ResidenceLocationService extends IService<ResidenceLocation,String> {
    ResidenceLocation retrieveByDesc(String RlocationDesc);
    List<ResidenceLocation> getAll();
}
