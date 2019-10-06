package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldRepository;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.location.SportFieldService;

import java.util.List;
import java.util.Set;


public class SportFieldServiceImpl implements SportFieldService {


    @Override
    public SportField retrieveByDesc(String sportFieldDesc) {
        return null;
    }

    @Override
    public List<SportField> getAll() {
        return null;
    }

    @Override
    public SportField create(SportField sportField) {
        return null;
    }

    @Override
    public SportField read(String s) {
        return null;
    }

    @Override
    public SportField update(SportField sportField) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
