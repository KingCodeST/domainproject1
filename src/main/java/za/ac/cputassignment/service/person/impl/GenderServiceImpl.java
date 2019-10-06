package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.GenderRepository;

import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.service.person.GenderService;

import java.util.List;
import java.util.Set;


public class GenderServiceImpl implements GenderService {


    @Override
    public Gender retrieveByDesc(String genderDesc) {
        return null;
    }

    @Override
    public List<Gender> getAll() {
        return null;
    }

    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(String s) {
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

