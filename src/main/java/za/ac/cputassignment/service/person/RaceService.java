package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race,String> {
    Set<Race> getAll();
}
