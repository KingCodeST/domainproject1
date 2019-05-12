package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.trasportRepositoryImpl.BusInforRepositoryImpl;
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.service.Impl.PersonServiceImpl.BusDriverInforServiceImpl;
import za.ac.cputassignment.service.service.TransportService.BusInforService;

import java.util.Set;

@Service
public class BusInforServiceImpl implements BusInforService {

    private static BusInforServiceImpl service=null;
    private BusInforRepository repository;

    private BusInforServiceImpl()
    {
        this.repository = BusInforRepositoryImpl.getRepository();
    }

    public static BusInforServiceImpl getService()
    {
        if(service ==null) service =new BusInforServiceImpl();
        return service;

    }


    @Override
    public Set<BusInfor> getAll() {
        return null;
    }

    @Override
    public BusInfor create(BusInfor busInfor) {
        return null;
    }

    @Override
    public BusInfor read(String s) {
        return null;
    }

    @Override
    public BusInfor update(BusInfor busInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
