package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusRepository;

import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;
import za.ac.cputassignment.service.transport.BusService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class BusServiceImpl implements BusService {

    private static BusService busService= null;

    @Autowired
    private BusRepository busRepository;

    private BusServiceImpl() {
    }

    public static BusService getVehicleService(){
        if (busService ==null) busService=new BusServiceImpl();
        return busService;
    }

    @Override
    public Bus retrieveByDesc(String vehicleDesc) {
        List<Bus> campusLocations= getAll();
        for(Bus campusRepository: campusLocations)
        {
            if (campusRepository.getModelNo().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<Bus> getAll() {
        return this.busRepository.findAll();
    }

    @Override
    public Bus create(Bus campusRepository) {

        return this.busRepository.save(campusRepository);
    }

    @Override
    public Bus read(String s) {
        Optional<Bus> optVehicle =this.busRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public Bus update(Bus campusRepository) {
        return this.busRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.busRepository.deleteById(s);
    }

}

