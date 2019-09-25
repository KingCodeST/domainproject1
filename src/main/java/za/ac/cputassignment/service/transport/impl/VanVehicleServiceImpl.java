package za.ac.cputassignment.service.transport.impl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.transport.VanVehicleRepository;
import za.ac.cputassignment.Repository.transport.impl.VanVehicleRepositoryImpl;
import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.service.transport.VanVehicleService;

import java.util.Set;

@Service("serviceImpl")
public class VanVehicleServiceImpl implements VanVehicleService {

    private static VanVehicleServiceImpl service=null;
    private VanVehicleRepository repository;

    private VanVehicleServiceImpl(){
        this.repository = (VanVehicleRepository) VanVehicleRepositoryImpl.getRepository();
    }

    public static VanVehicleServiceImpl getService(){
        if(service ==null) service =new VanVehicleServiceImpl();
        return service;
    }



    @Override
    public Set<VanVehicle> getAll() {
        return this.repository.getAll();
    }

    @Override
    public VanVehicle create(VanVehicle objectEntity) {

        return this.repository.create(objectEntity);
    }

    @Override
    public VanVehicle read(String s) {
        return this.repository.read(s);
    }

    @Override
    public VanVehicle update(VanVehicle objectEntity) {
        return this.repository.update(objectEntity);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}

