package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class BusInforRepositoryImpl implements BusInforService {

    private static BusInforRepositoryImpl repository = null;
    private Set<BusInfor> busInforSet;

    private BusInforRepositoryImpl() {
        this.busInforSet = new HashSet<>();
    }

    private BusInfor FindStudentId(String busInforId) {
        return this.busInforSet.stream()
                .filter(driverBus -> driverBus.getVehicleBusId().trim().equals(busInforId))
                .findAny()
                .orElse(null);
    }

    public static BusInforRepositoryImpl getRepository() {
        if (repository == null) repository = new BusInforRepositoryImpl();
        return repository;
    }

    @Override
    public Set<BusInfor> getAll() {
        return this.busInforSet;
    }

    @Override
    public BusInfor create(BusInfor busInforObj) {
        this.busInforSet.add(busInforObj);
        return busInforObj;
    }

    @Override
    public BusInfor read(String residenceLocationID) {
        BusInfor busInforObj = FindStudentId(residenceLocationID);
        return busInforObj;
    }

    @Override
    public BusInfor update(BusInfor busInforObj) {
        BusInfor toDelete = FindStudentId(busInforObj.getVehicleBusId());
        if (toDelete != null) {
            this.busInforSet.remove(toDelete);
            return create(busInforObj);
        }
        return null;
    }

    @Override
    public void delete(String busInforId) {
        BusInfor busInforObj = FindStudentId(busInforId);
        if (busInforObj != null) this.busInforSet.remove(busInforObj);

    }

}

