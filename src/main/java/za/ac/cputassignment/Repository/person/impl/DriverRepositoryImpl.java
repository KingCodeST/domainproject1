package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.Set;

@Repository("InMemory")
public class DriverRepositoryImpl implements DriverRepository {
    @Override
    public Set<Driver> getAll() {
        return null;
    }

    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver read(String s) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
