package za.ac.cputassignment.service.eventTrigger.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTrigger.ArletInforRepository;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.eventTrigger.ArletInforService;

import java.util.List;
import java.util.Optional;


@Service("ServiceArletInforImpl")
public class ArletInforServiceImpl implements ArletInforService {


    private static  ArletInforService arletInforService= null;

    @Autowired
    private ArletInforRepository arletInforRepository;

    private ArletInforServiceImpl() {
    }

    public static ArletInforService getVehicleService(){
        if (arletInforService ==null) arletInforService=new ArletInforServiceImpl();
        return arletInforService;
    }

    @Override
    public ArletInfor retrieveByDesc(String vehicleDesc) {
        List<ArletInfor> vehicles= getAll();
        for(ArletInfor arletInfor: vehicles)
        {
            if (arletInfor.getAlertInforId().equalsIgnoreCase(vehicleDesc))
                return  arletInfor;
        }
        return null;
    }

    @Override
    public List<ArletInfor> getAll() {
        return this.arletInforRepository.findAll();
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {

        return this.arletInforRepository.save(arletInfor);
    }

    @Override
    public ArletInfor read(String s) {
        Optional<ArletInfor> optVehicle =this.arletInforRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return this.arletInforRepository.save(arletInfor);
    }

    @Override
    public void delete(String s) {
        this.arletInforRepository.deleteById(s);
    }
}

