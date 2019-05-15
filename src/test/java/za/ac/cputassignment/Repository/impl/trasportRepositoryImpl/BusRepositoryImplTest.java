package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.transportFactory.BusFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusRepositoryImplTest {


    private BusRepository repository;
    private Bus bus;

    private  Bus getSavedBus()
    {
        Set<Bus> savedBus =this.repository.getAll();
        return savedBus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =BusRepositoryImpl.getRepository();
        this.bus = BusFactory.getBus("Toyota",980293,"",54,"GF464");
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