package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SpecialLocationRepository;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.service.location.SpecialLocationService;

import java.util.List;
import java.util.Optional;
import java.util.Set;



public class SpecialLocationServiceImpl implements SpecialLocationService {

    private static SpecialLocationService specialLocationService= null;

    @Autowired
    private SpecialLocationRepository specialLocationRepository;

    private SpecialLocationServiceImpl() {
    }

    public static SpecialLocationService getVehicleService(){
        if (specialLocationService ==null) specialLocationService=new SpecialLocationServiceImpl();
        return specialLocationService;
    }

    @Override
    public SpecialLocation retrieveByDesc(String vehicleDesc) {
        List<SpecialLocation> campusLocations= getAll();
        for(SpecialLocation campusRepository: campusLocations)
        {
            if (campusRepository.getAddress().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<SpecialLocation> getAll() {
        return this.specialLocationRepository.findAll();
    }

    @Override
    public SpecialLocation create(SpecialLocation campusRepository) {

        return this.specialLocationRepository.save(campusRepository);
    }

    @Override
    public SpecialLocation read(String s) {
        Optional<SpecialLocation> optVehicle =this.specialLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public SpecialLocation update(SpecialLocation campusRepository) {
        return this.specialLocationRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.specialLocationRepository.deleteById(s);
    }

}
