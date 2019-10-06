package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceRepository;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.service.location.ResidenceService;

import java.util.List;
import java.util.Set;


public class ResidenceServiceImpl implements ResidenceService {


    @Override
    public Residence retrieveByDesc(String residenceDesc) {
        return null;
    }

    @Override
    public List<Residence> getAll() {
        return null;
    }

    @Override
    public Residence create(Residence residence) {
        return null;
    }

    @Override
    public Residence read(String s) {
        return null;
    }

    @Override
    public Residence update(Residence residence) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
