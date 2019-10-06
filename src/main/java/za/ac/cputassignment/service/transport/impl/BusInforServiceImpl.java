package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusInforRepository;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;

import java.util.List;
import java.util.Set;


public class BusInforServiceImpl implements BusInforService {


    @Override
    public BusInfor retrieveByDesc(String businforDesc) {
        return null;
    }

    @Override
    public List<BusInfor> getAll() {
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

