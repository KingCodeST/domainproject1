package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.RaceRepository;

import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.service.person.RaceService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class RaceServiceImpl implements RaceService {

    private static RaceService raceService= null;

    @Autowired
    private RaceRepository raceRepository;

    private RaceServiceImpl() {
    }

    public static RaceService getVehicleService(){
        if (raceService ==null) raceService=new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Race retrieveByDesc(String vehicleDesc) {
        List<Race> campusLocations= getAll();
        for(Race campusRepository: campusLocations)
        {
            if (campusRepository.getRaceGroup().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Race> getAll() {
        return this.raceRepository.findAll();
    }

    @Override
    public Race create(Race campusRepository) {

        return this.raceRepository.save(campusRepository);
    }

    @Override
    public Race read(String s) {
        Optional<Race> optVehicle =this.raceRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Race update(Race campusRepository) {
        return this.raceRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.raceRepository.deleteById(s);
    }

}

