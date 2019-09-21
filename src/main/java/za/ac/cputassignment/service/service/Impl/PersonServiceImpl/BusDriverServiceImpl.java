package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusDriverRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.Driver;
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
    public Set<Driver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Driver create(Driver driver) {
        return this.repository.create(driver);
    }

    @Override
    public Driver read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Driver update(Driver driver) {
        return this.repository.update(driver);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
