package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SpecialLocationRepository;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.location.SpecialLocationService;

import java.util.List;
import java.util.Set;



public class SpecialLocationServiceImpl implements SpecialLocationService {


    @Override
    public SpecialLocation retrieveByDesc(String specialDesc) {
        return null;
    }

    @Override
    public List<SpecialLocation> getAll() {
        return null;
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        return null;
    }

    @Override
    public SpecialLocation read(String s) {
        return null;
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}