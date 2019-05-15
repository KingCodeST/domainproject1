package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusBusDriverInforRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverInfor;
import za.ac.cputassignment.service.service.PersonService.BusDriverInforService;

import java.util.Set;

@Service
public class BusDriverInforServiceImpl implements BusDriverInforService {

    private static BusDriverInforServiceImpl service=null;
    private DriverInforRepository repository;

    public BusDriverInforServiceImpl()
    {
        this.repository = BusBusDriverInforRepositoryImpl.getRepository();

    }

    public static BusDriverInforServiceImpl getService()
    {
        if(service ==null) service =new BusDriverInforServiceImpl();
        return service;
    }

    @Override
    public Set<DriverInfor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DriverInfor create(DriverInfor driverInfor) {
        return this.repository.create(driverInfor);
    }

    @Override
    public DriverInfor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DriverInfor update(DriverInfor driverInfor) {
        return this.repository.update(driverInfor);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
