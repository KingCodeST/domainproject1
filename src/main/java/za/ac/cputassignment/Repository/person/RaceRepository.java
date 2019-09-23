package za.ac.cputassignment.Repository.person;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.person.Race;

import java.util.Set;

public interface RaceRepository extends IRepository<Race,String> {
    Set<Race>getAll();
}
