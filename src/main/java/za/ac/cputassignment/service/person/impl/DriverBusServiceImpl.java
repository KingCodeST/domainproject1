package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverBusRepository;

import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.person.DriverBusService;

import java.util.List;
import java.util.Set;


public class DriverBusServiceImpl implements DriverBusService {


    @Override
    public DriverBus retrieveByDesc(String driverBusDesc) {
        return null;
    }

    @Override
    public List<DriverBus> getAll() {
        return null;
    }

    @Override
    public DriverBus create(DriverBus driverBus) {
        return null;
    }

    @Override
    public DriverBus read(String s) {
        return null;
    }

    @Override
    public DriverBus update(DriverBus driverBus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
