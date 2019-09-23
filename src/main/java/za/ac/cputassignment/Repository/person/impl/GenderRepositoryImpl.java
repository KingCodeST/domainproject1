package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.GenderRepository;
import za.ac.cputassignment.domain.person.Gender;

import java.util.Set;

@Repository("InMemory")
public class GenderRepositoryImpl implements GenderRepository {
    @Override
    public Set<Gender> getAll() {
        return null;
    }

    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(String s) {
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
