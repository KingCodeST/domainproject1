package za.ac.cputassignment.service.person.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.person.DriverBusRepository;

import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.person.DriverBusService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class DriverBusServiceImpl implements DriverBusService {

    private static DriverBusService driverBusService= null;

    @Autowired
    private DriverBusRepository driverBusRepository;

    private DriverBusServiceImpl() {
    }

    public static DriverBusService getVehicleService(){
        if (driverBusService ==null) driverBusService=new DriverBusServiceImpl();
        return driverBusService;
    }

    @Override
    public DriverBus retrieveByDesc(String vehicleDesc) {
        List<DriverBus> campusLocations= getAll();
        for(DriverBus campusRepository: campusLocations)
        {
            if (campusRepository.getBusDriverName().equalsIgnoreCase(vehicleDesc))
                return  campusRepository;
        }
        return null;
    }

    @Override
    public List<DriverBus> getAll() {
        return this.driverBusRepository.findAll();
    }

    @Override
    public DriverBus create(DriverBus campusRepository) {

        return this.driverBusRepository.save(campusRepository);
    }

    @Override
    public DriverBus read(String s) {
        Optional<DriverBus> optVehicle =this.driverBusRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public DriverBus update(DriverBus campusRepository) {
        return this.driverBusRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.driverBusRepository.deleteById(s);
    }

}
