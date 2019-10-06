package za.ac.cputassignment.service.location;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface ResidenceService extends IService<Residence,String> {
    Residence retrieveByDesc(String residenceDesc);
    List<Residence> getAll();
}
