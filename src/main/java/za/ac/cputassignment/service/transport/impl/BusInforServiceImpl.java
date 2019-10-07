package za.ac.cputassignment.service.transport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.BusInforRepository;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.transport.BusInforService;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class BusInforServiceImpl implements BusInforService {

    private static BusInforService busInforService = null;

    @Autowired
    private BusInforRepository busInforRepository;

    private BusInforServiceImpl() {
    }

    public static BusInforService getVehicleService() {
        if (busInforService == null) busInforService = new BusInforServiceImpl();
        return busInforService;
    }

    @Override
    public BusInfor retrieveByDesc(String vehicleDesc) {
        List<BusInfor> campusLocations = getAll();
        for (BusInfor campusRepository : campusLocations) {
            if (campusRepository.getVehicleBus().equalsIgnoreCase(vehicleDesc))
                return campusRepository;
        }
        return null;
    }

    @Override
    public List<BusInfor> getAll() {
        return this.busInforRepository.findAll();
    }

    @Override
    public BusInfor create(BusInfor campusRepository) {

        return this.busInforRepository.save(campusRepository);
    }

    @Override
    public BusInfor read(String s) {
        Optional<BusInfor> optVehicle = this.busInforRepository.findById(s);
        return optVehicle.orElse(null);
    }

    @Override
    public BusInfor update(BusInfor campusRepository) {
        return this.busInforRepository.save(campusRepository);
    }

    @Override
    public void delete(String s) {
        this.busInforRepository.deleteById(s);
    }
}
