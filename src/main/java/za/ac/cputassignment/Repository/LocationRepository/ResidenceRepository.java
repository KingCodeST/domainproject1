package za.ac.cputassignment.Repository.LocationRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.Set;

public interface ResidenceRepository extends IRepository<Residence,String> {
    Set<Residence>getAll();

}
