package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.CampusLocationRepository;

import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.service.location.CampusLocationService;

import java.util.List;
import java.util.Set;


public class CampusLocationServiceImpl implements CampusLocationService  {


    @Override
    public CampusLocation retrieveByDesc(String clocationDesc) {
        return null;
    }

    @Override
    public List<CampusLocation> getAll() {
        return null;
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {
        return null;
    }

    @Override
    public CampusLocation read(String s) {
        return null;
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}