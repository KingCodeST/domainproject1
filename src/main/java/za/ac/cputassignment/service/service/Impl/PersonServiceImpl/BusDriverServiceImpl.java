package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusDriverRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.service.service.PersonService.BusDriverService;

import java.util.Set;

@Service
public class BusDriverServiceImpl implements BusDriverService {

    private static  BusDriverServiceImpl service=null;
    private BusDriverRepository repository;

    private BusDriverServiceImpl()
    {
        this.repository = BusDriverRepositoryImpl.getRepository();
    }


    public static BusDriverServiceImpl getService()
    {
        if(service ==null) service =new BusDriverServiceImpl();
        return service;
    }

    @Override
    public Set<BusDriver> getAll() {
        return null;
    }

    @Override
    public BusDriver create(BusDriver busDriver) {
        return null;
    }

    @Override
    public BusDriver read(String s) {
        return null;
    }

    @Override
    public BusDriver update(BusDriver busDriver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
