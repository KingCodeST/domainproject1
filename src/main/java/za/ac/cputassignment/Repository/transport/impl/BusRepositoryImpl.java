package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.transport.BusService;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class BusRepositoryImpl implements BusService {

    private static BusRepositoryImpl repository = null;
    private Set<Bus> busSet;

    private BusRepositoryImpl() {
        this.busSet = new HashSet<>();
    }

    private Bus FindStudentId(String busId) {
        return this.busSet.stream()
                .filter(driverBus -> driverBus.getBusId().trim().equals(busId))
                .findAny()
                .orElse(null);
    }

    public static BusRepositoryImpl getRepository() {
        if (repository == null) repository = new BusRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Bus> getAll() {
        return this.busSet;
    }

    @Override
    public Bus create(Bus busObj) {
        this.busSet.add(busObj);
        return busObj;
    }

    @Override
    public Bus read(String residenceLocationID) {
        Bus busObj = FindStudentId(residenceLocationID);
        return busObj;
    }

    @Override
    public Bus update(Bus busObj) {
        Bus toDelete = FindStudentId(busObj.getBusId());
        if (toDelete != null) {
            this.busSet.remove(toDelete);
            return create(busObj);
        }
        return null;
    }

    @Override
    public void delete(String busId) {
        Bus busObj = FindStudentId(busId);
        if (busObj != null) this.busSet.remove(busObj);

    }

}


