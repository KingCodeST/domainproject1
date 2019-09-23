package za.ac.cputassignment.Repository.person.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.person.DriverBusRepository;
import za.ac.cputassignment.domain.person.DriverBus;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class DriverBusRepositoryImpl implements DriverBusRepository {


    private static DriverBusRepositoryImpl repository =null;
    private Set<DriverBus> DriverBusSet;

    private DriverBusRepositoryImpl(){
        this.DriverBusSet =new HashSet<>();
    }

    private DriverBus findArletInfor(String driverBusId)
    {
        return this.DriverBusSet.stream()
                .filter(driverBus -> driverBus.getDriverId().trim().equals(driverBusId))
                .findAny()
                .orElse(null);
    }

    public static DriverBusRepositoryImpl getRepository(){
        if(repository ==null) repository=new DriverBusRepositoryImpl();
        return repository;
    }

    @Override
    public Set<DriverBus> getAll() {
        return this.DriverBusSet;
    }

    @Override
    public DriverBus create(DriverBus driverBusOb) {
        this.DriverBusSet.add(driverBusOb);
        return driverBusOb;
    }

    @Override
    public DriverBus read(String residenceLocationID) {
        DriverBus driverBusOb=findArletInfor(residenceLocationID);
        return driverBusOb;
    }

    @Override
    public DriverBus update(DriverBus driverBusOb) {
        DriverBus toDelete =findArletInfor(driverBusOb.getDriverId());
        if(toDelete !=null)
        {
            this.DriverBusSet.remove(toDelete);
            return create(driverBusOb);
        }
        return null;
    }

    @Override
    public void delete(String driverBusId) {
        DriverBus driverBusOb=findArletInfor(driverBusId);
        if (driverBusOb !=null) this.DriverBusSet.remove(driverBusOb);

    }
}