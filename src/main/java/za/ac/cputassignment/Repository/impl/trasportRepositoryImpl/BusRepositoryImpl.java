package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.Bus;

import java.util.HashSet;
import java.util.Set;

public class BusRepositoryImpl implements BusRepository {

    private static BusRepositoryImpl repository = null;
    private Set<Bus> buses;

    private BusRepositoryImpl() {
        this.buses = new HashSet<>();
    }

    public static BusRepository getRepository() {
        if (repository == null) repository = new BusRepositoryImpl();
        return repository;
    }

    private Bus findBus(String busId)
    {
        return (Bus) this.buses.stream().filter(bus -> bus.getId().trim().equals(busId))
                .findAny().orElse(null);
    }

    @Override
    public Set<Bus> getAll() {
        return this.buses;
    }

    @Override
    public Bus create(Bus bus) {
        this.buses.add(bus);
        return bus;
    }

    @Override
    public Bus update(Bus bus) {
        Bus toDelete =findBus(bus.getId());
        if(toDelete !=null){
            this.buses.remove(toDelete);
        return create(bus);}
        return null;
    }

    @Override
    public void delete(String busId) {
        Bus bus =findBus(busId);
        if(bus !=null) this.buses.remove(bus);

    }

    @Override
    public Bus read(String busId) {
        Bus bus=findBus(busId);
        return bus;
    }
}