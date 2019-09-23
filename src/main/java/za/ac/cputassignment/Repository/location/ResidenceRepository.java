package za.ac.cputassignment.Repository.location;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.Set;

public interface ResidenceRepository extends IRepository<Residence,String> {
    Set<Residence>getAll();
}
