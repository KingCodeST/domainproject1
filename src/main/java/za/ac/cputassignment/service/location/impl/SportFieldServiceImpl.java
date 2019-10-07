package za.ac.cputassignment.service.location.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.location.SportFieldRepository;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.service.location.SportFieldService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class SportFieldServiceImpl implements SportFieldService {


    private static SportFieldService sportFieldService= null;

    @Autowired
    private SportFieldRepository sportFieldRepository;

    private SportFieldServiceImpl() {
    }

    public static SportFieldService getVehicleService(){
        if (sportFieldService ==null) sportFieldService=new SportFieldServiceImpl();
        return sportFieldService;
    }

    @Override
    public SportField retrieveByDesc(String vehicleDesc) {
        List<SportField> campusLocations= getAll();
        for(SportField campusRepository: campusLocations)
        {
            if (campusRepository.getAddress().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<SportField> getAll() {
        return this.sportFieldRepository.findAll();
    }

    @Override
    public SportField create(SportField campusRepository) {

        return this.sportFieldRepository.save(campusRepository);
    }

    @Override
    public SportField read(String s) {
        Optional<SportField> optVehicle =this.sportFieldRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public SportField update(SportField campusRepository) {
        return this.sportFieldRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.sportFieldRepository.deleteById(s);
    }

}
