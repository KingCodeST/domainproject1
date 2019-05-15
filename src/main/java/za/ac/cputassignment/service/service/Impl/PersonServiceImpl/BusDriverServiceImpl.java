package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusDriverRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.service.service.PersonService.BusDriverService;

import java.util.Set;

@Service
public class BusDriverServiceImpl implements BusDriverService {
    @Autowired
    @Qualifier
    private BusDriverRepository repository;

    private BusDriverServiceImpl()
    {
        this.repository = BusDriverRepositoryImpl.getRepository();
    }




    @Override
    public Set<BusDriver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public BusDriver create(BusDriver busDriver) {
        return this.repository.create(busDriver);
    }

    @Override
    public BusDriver read(String s) {
        return this.repository.read(s);
    }

    @Override
    public BusDriver update(BusDriver busDriver) {
        return this.repository.update(busDriver);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
