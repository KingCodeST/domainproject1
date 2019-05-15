package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.Bus;

import java.util.*;
@Repository("InMemory")
public class BusRepositoryImpl implements BusRepository {

    private static BusRepositoryImpl repository = null;
    private Map<String,Bus> buses;

    private BusRepositoryImpl() {
        this.buses = new HashMap<>();
    }

    public static BusRepository getRepository() {
        if (repository == null) repository = new BusRepositoryImpl();
        return repository;
    }



    @Override
    public Set<Bus> getAll() {
        Collection<Bus> buses=this.buses.values();
        Set<Bus> set=new HashSet<>();
        set.addAll(buses);
        return set;
    }

    @Override
    public Bus create(Bus bus) {
        this.buses.put(bus.getId(),bus);
        return bus;
    }

    @Override
    public Bus update(Bus bus) {
       this.buses.replace(bus.getId(),bus);
       return this.buses.get(bus.getId());
    }

    @Override
    public void delete(String busId) {
       this.buses.remove(busId);

    }

    @Override
    public Bus read(String busId) {
       return this.buses.get(busId);
    }
}