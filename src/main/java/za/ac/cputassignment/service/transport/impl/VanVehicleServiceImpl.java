package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanVehicleRepository;

import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.transport.VanVehicleService;

import java.util.List;
import java.util.Set;


public class VanVehicleServiceImpl implements VanVehicleService {


    @Override
    public VanVehicle retrieveByDesc(String vanVehicleDesc) {
        return null;
    }

    @Override
    public List<VanVehicle> getAll() {
        return null;
    }

    @Override
    public VanVehicle create(VanVehicle vanVehicle) {
        return null;
    }

    @Override
    public VanVehicle read(String s) {
        return null;
    }

    @Override
    public VanVehicle update(VanVehicle vanVehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}

