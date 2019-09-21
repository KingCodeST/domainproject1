package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import za.ac.cputassignment.Repository.impl.personRepositoryImpl.DriverInforRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.service.service.PersonService.DriverInforService;

import java.util.Set;

@Service("ServiceImpl")
public class DriverInforServiceImpl implements DriverInforService {

    @Autowired
    @Qualifier
    private DriverInforRepositoryImpl repository;

    private DriverInforServiceImpl()
    {
        this.repository =DriverInforRepositoryImpl.getRepository();
    }



    @Override
    public Set<DriverBus> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DriverBus create(DriverBus driverBus) {
        return this.repository.create(driverBus);
    }

    @Override
    public DriverBus read(String s) {
        return this.repository.read(s);
    }

    @Override
    public DriverBus update(DriverBus driverBus) {
        return this.repository.update(driverBus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
