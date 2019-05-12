package za.ac.cputassignment.service.service.LocationService;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface ResidenceService extends IService<Residence,String> {
    Set<Residence> getAll();
}
