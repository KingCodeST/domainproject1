package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.RaceRepository;
import za.ac.cputassignment.domain.person.Race;

import java.util.Set;

@Repository("InMemory")
public class RaceRepositoryImpl implements RaceRepository {
    @Override
    public Set<Race> getAll() {
        return null;
    }

    @Override
    public Race create(Race race) {
        return null;
    }

    @Override
    public Race read(String s) {
        return null;
    }

    @Override
    public Race update(Race race) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
