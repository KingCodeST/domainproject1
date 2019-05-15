package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import za.ac.cputassignment.Repository.impl.personRepositoryImpl.DriverInforRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverInfor;
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
