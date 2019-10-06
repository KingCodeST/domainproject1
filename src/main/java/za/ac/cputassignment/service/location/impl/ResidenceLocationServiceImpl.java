package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceLocationRepository;

import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.service.location.ResidenceLocationService;

import java.util.List;
import java.util.Set;


public class ResidenceLocationServiceImpl implements ResidenceLocationService {


    @Override
    public ResidenceLocation retrieveByDesc(String RlocationDesc) {
        return null;
    }

    @Override
    public List<ResidenceLocation> getAll() {
        return null;
    }

    @Override
    public ResidenceLocation create(ResidenceLocation residenceLocation) {
        return null;
    }

    @Override
    public ResidenceLocation read(String s) {
        return null;
    }

    @Override
    public ResidenceLocation update(ResidenceLocation residenceLocation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
