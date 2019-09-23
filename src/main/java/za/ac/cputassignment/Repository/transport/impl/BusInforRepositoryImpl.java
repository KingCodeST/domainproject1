package za.ac.cputassignment.Repository.transport.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;

import java.util.Set;

@Repository("InMemory")
public class BusInforRepositoryImpl implements BusInforService {
    @Override
    public Set<BusInfor> getAll() {
        return null;
    }

    @Override
    public BusInfor create(BusInfor busInfor) {
        return null;
    }

    @Override
    public BusInfor read(String s) {
        return null;
    }

    @Override
    public BusInfor update(BusInfor busInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
