package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SpecialLocationLRepository;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.service.location.SpecialLocationLService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class SpecialLocationLServiceImpl implements SpecialLocationLService {

    private static SpecialLocationLService specialLocationLService= null;

    @Autowired
    private SpecialLocationLRepository specialLocationLRepository;

    private SpecialLocationLServiceImpl() {
    }

    public static SpecialLocationLService getVehicleService(){
        if (specialLocationLService ==null) specialLocationLService=new SpecialLocationLServiceImpl();
        return specialLocationLService;
    }


    @Override
    public SpecialLocation retrieveByDesc(String specialDesc) {
        return null;
    }

    @Override
    public List<SpecialLocationL> getAll() {
        return this.specialLocationLRepository.findAll();
    }

    @Override
    public SpecialLocationL create(SpecialLocationL campusRepository) {

        return this.specialLocationLRepository.save(campusRepository);
    }

    @Override
    public SpecialLocationL read(String s) {
        Optional<SpecialLocationL> optVehicle =this.specialLocationLRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public SpecialLocationL update(SpecialLocationL campusRepository) {
        return this.specialLocationLRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.specialLocationLRepository.deleteById(s);
    }

}
