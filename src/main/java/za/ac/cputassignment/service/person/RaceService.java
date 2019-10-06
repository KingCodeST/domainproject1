package za.ac.cputassignment.service.person;

import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface RaceService extends IService<Race,String> {
    Race retrieveByDesc(String raceDesc);
    List<Race> getAll();
}
