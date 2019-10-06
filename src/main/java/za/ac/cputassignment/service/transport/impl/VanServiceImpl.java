package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanRepository;

import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.transport.VanService;

import java.util.List;
import java.util.Set;


public class VanServiceImpl implements VanService  {


    @Override
    public Van retrieveByDesc(String vanDesc) {
        return null;
    }

    @Override
    public List<Van> getAll() {
        return null;
    }

    @Override
    public Van create(Van van) {
        return null;
    }

    @Override
    public Van read(String s) {
        return null;
    }

    @Override
    public Van update(Van van) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

