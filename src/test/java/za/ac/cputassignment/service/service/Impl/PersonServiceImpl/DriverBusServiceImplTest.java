package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.DriverInforRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverBus;

public class DriverBusServiceImplTest {

    private DriverInforRepositoryImpl repository;
    private DriverBus driverBus;


    private DriverBus getSaved()
    {
        return this.repository.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}