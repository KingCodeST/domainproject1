package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.GenderRepository;

import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.service.person.GenderService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class GenderServiceImpl implements GenderService {

    private static GenderService genderService= null;

    @Autowired
    private GenderRepository genderRepository;

    private GenderServiceImpl() {
    }

    public static GenderService getVehicleService(){
        if (genderService ==null) genderService=new GenderServiceImpl();
        return genderService;
    }

    @Override
    public Gender retrieveByDesc(String vehicleDesc) {
        List<Gender> campusLocations= getAll();
        for(Gender campusRepository: campusLocations)
        {
            if (campusRepository.getGenderGroup().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Gender> getAll() {
        return this.genderRepository.findAll();
    }

    @Override
    public Gender create(Gender campusRepository) {

        return this.genderRepository.save(campusRepository);
    }

    @Override
    public Gender read(String s) {
        Optional<Gender> optVehicle =this.genderRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Gender update(Gender campusRepository) {
        return this.genderRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.genderRepository.deleteById(s);
    }

}

