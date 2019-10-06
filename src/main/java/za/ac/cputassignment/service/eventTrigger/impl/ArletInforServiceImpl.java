package za.ac.cputassignment.service.eventTrigger.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;

import java.util.List;
import java.util.Set;

@Service("ServiceArletInforImpl")
public class ArletInforServiceImpl implements ArletInforService {


    @Override
    public ArletInfor retrieveByDesc(String arletDesc) {
        return null;
    }

    @Override
    public List<ArletInfor> getAll() {
        return null;
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public ArletInfor read(String s) {
        return null;
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
