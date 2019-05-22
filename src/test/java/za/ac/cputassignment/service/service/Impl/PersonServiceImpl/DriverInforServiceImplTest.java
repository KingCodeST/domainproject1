package za.ac.cputassignment.service.service.Impl.PersonServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.DriverInforRepositoryImpl;
import za.ac.cputassignment.domain.person.DriverInfor;

import static org.junit.Assert.*;

public class DriverInforServiceImplTest {

    private DriverInforRepositoryImpl repository;
    private DriverInfor driverInfor;


    private DriverInfor getSaved()
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