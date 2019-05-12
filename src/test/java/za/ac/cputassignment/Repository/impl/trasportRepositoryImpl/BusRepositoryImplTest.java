package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.transportFactory.BusFactory;

import java.util.Set;

import static org.junit.Assert.*;
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