package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldLocationRepository;

import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.service.location.SportFieldLocationService;

import java.util.List;
import java.util.Set;


public class SportFieldLocationServiceImpl implements SportFieldLocationService  {


    @Override
    public SportFieldLocation retrieveByDesc(String sportLocationDesc) {
        return null;
    }

    @Override
    public List<SportFieldLocation> getAll() {
        return null;
    }

    @Override
    public SportFieldLocation create(SportFieldLocation sportFieldLocation) {
        return null;
    }

    @Override
    public SportFieldLocation read(String s) {
        return null;
    }

    @Override
    public SportFieldLocation update(SportFieldLocation sportFieldLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
