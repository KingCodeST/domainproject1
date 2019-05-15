package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.factory.personFactory.BusDriverFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusDriverRepositoryImplTest {

    private BusDriverRepository repository;
    private BusDriver busDriver;

    private BusDriver getSavedBusDriver()
    {
        Set<BusDriver> savedBusDriver=this.repository.getAll();
        return savedBusDriver.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =BusDriverRepositoryImpl.getRepository();
        this.busDriver = BusDriverFactory.getBusDriver("Vuyo","Mogen","C2090",5);
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}