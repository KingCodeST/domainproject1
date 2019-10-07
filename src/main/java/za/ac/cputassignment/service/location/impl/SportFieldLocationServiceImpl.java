package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldLocationRepository;

import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.service.location.SportFieldLocationService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class SportFieldLocationServiceImpl implements SportFieldLocationService  {

    private static SportFieldLocationService sportFieldLocationService= null;

    @Autowired
    private SportFieldLocationRepository sportFieldLocationRepository;

    private SportFieldLocationServiceImpl() {
    }

    public static SportFieldLocationService getVehicleService(){
        if (sportFieldLocationService ==null) sportFieldLocationService=new SportFieldLocationServiceImpl();
        return sportFieldLocationService;
    }

    @Override
    public SportFieldLocation retrieveByDesc(String vehicleDesc) {
        List<SportFieldLocation> campusLocations= getAll();
        for(SportFieldLocation campusRepository: campusLocations)
        {
            if (campusRepository.getAddress().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<SportFieldLocation> getAll() {
        return this.sportFieldLocationRepository.findAll();
    }

    @Override
    public SportFieldLocation create(SportFieldLocation campusRepository) {

        return this.sportFieldLocationRepository.save(campusRepository);
    }

    @Override
    public SportFieldLocation read(String s) {
        Optional<SportFieldLocation> optVehicle =this.sportFieldLocationRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public SportFieldLocation update(SportFieldLocation campusRepository) {
        return this.sportFieldLocationRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.sportFieldLocationRepository.deleteById(s);
    }

}
