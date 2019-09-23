package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface CampusService  extends IService<Campus,String> {
    Set<Campus>getAll();
}
