package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.ResidenceLocationRepository;

import za.ac.cputassignment.domain.location.ResidenceLocation;
import za.ac.cputassignment.service.location.ResidenceLocationService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class ResidenceLocationServiceImpl implements ResidenceLocationService {


    private static ResidenceLocationService residenceLocationService= null;

    @Autowired
    private ResidenceLocationRepository residenceLocationRepository;

    private ResidenceLocationServiceImpl() {
    }

    public static ResidenceLocationService getVehicleService(){
        if (residenceLocationService ==null) residenceLocationService=new ResidenceLocationServiceImpl();
        return residenceLocationService;
    }

    @Override
    public ResidenceLocation retrieveByDesc(String vehicleDesc) {
        List<ResidenceLocation> campusLocations= getAll();
        for(ResidenceLocation campusRepository: campusLocations)
        {
            if (campusRepository.getResidenceLocation().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<ResidenceLocation> getAll() {
        return this.residenceLocationRepository.findAll();
    }

    @Override
    public ResidenceLocation create(ResidenceLocation campusRepository) {

        return this.residenceLocationRepository.save(campusRepository);
    }

    @Override
    public ResidenceLocation read(String s) {
        Optional<ResidenceLocation> optVehicle =this.residenceLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public ResidenceLocation update(ResidenceLocation campusRepository) {
        return this.residenceLocationRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.residenceLocationRepository.deleteById(s);
    }

}
