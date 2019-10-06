package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusRepository;

import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;
import za.ac.cputassignment.service.transport.BusService;

import java.util.List;
import java.util.Set;


public class BusServiceImpl implements BusService {


    @Override
    public Bus retrieveByDesc(String busDesc) {
        return null;
    }

    @Override
    public List<Bus> getAll() {
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

