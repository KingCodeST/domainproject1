package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.trasportRepositoryImpl.BusRepositoryImpl;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.service.service.TransportService.BusService;

import java.util.Set;

@Service
public class BusServiceImpl implements BusService {

    private static BusServiceImpl service=null;
    private BusRepository repository;

    private BusServiceImpl()
    {
        this.repository =BusRepositoryImpl.getRepository();

    }

    public static BusServiceImpl getService()
    {
        if(service ==null) service=new BusServiceImpl();
        return  service;
    }


    @Override
    public Set<Bus> getAll() {
        return null;
    }

    @Override
    public Bus create(Bus bus) {
        return null;
    }

    @Override
    public Bus read(String s) {
        return null;
    }

    @Override
    public Bus update(Bus bus) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
