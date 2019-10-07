package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;


import za.ac.cputassignment.Repository.location.CampusLocationRepository;
import za.ac.cputassignment.domain.location.CampusLocation;

import za.ac.cputassignment.service.location.CampusLocationService;


import java.util.List;
import java.util.Optional;


public class CampusLocationServiceImpl implements CampusLocationService  {

    private static CampusLocationService campusLocationService= null;

    @Autowired
    private CampusLocationRepository campusLocationRepository;

    private CampusLocationServiceImpl() {
    }

    public static CampusLocationService getVehicleService(){
        if (campusLocationService ==null) campusLocationService=new CampusLocationServiceImpl();
        return campusLocationService;
    }

    @Override
    public CampusLocation retrieveByDesc(String vehicleDesc) {
        List<CampusLocation> campusLocations= getAll();
        for(CampusLocation campusLocation: campusLocations)
        {
            if (campusLocation.getAddress().equalsIgnoreCase(vehicleDesc))
                return  campusLocation;
        }
        return null;
    }

    @Override
    public List<CampusLocation> getAll() {
        return this.campusLocationRepository.findAll();
    }

    @Override
    public CampusLocation create(CampusLocation campusLocation) {

        return this.campusLocationRepository.save(campusLocation);
    }

    @Override
    public CampusLocation read(String s) {
        Optional<CampusLocation> optVehicle =this.campusLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public CampusLocation update(CampusLocation campusLocation) {
        return this.campusLocationRepository.save(campusLocation);
    }

    @Override
    public void delete(String s) {
        this.campusLocationRepository.deleteById(s);
    }
}