package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface SpecialLocationLService  extends IService<SpecialLocationL,String> {
    Set<SpecialLocationL> getAll();
}
