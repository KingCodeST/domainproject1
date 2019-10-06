package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface SpecialLocationLService  extends IService<SpecialLocationL,String> {
    SpecialLocation retrieveByDesc(String specialDesc);
    List<SpecialLocationL> getAll();
}
