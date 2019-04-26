package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.BusInfor;

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


}