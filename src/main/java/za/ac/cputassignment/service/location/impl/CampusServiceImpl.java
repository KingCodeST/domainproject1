package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.CampusRepository;

import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.location.CampusService;

import java.util.List;
import java.util.Set;


public class CampusServiceImpl implements CampusService{


    @Override
    public Campus retrieveByDesc(String campusDesc) {
        return null;
    }

    @Override
    public List<Campus> getAll() {
        return null;
    }

    @Override
    public Campus create(Campus campus) {
        return null;
    }

    @Override
    public Campus read(String s) {
        return null;
    }

    @Override
    public Campus update(Campus campus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}