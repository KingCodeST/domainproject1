package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.transport.BusService;

import java.util.Set;

@Repository("InMemory")
public class BusRepositoryImpl implements BusService {
    @Override
    public Set<Bus> getAll() {
        return null;
    }

    @Override
    public Bus create(Bus bus) {
        return null;
    }

    @Override
    public Bus read(String s) {
        return null;
    }

    @Override
    public Bus update(Bus bus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
