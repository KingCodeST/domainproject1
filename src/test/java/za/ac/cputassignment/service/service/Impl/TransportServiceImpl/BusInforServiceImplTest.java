package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.trasportRepositoryImpl.BusInforRepositoryImpl;
import za.ac.cputassignment.domain.transport.BusInfor;

import static org.junit.Assert.*;

public class BusInforServiceImplTest {

    private BusInforRepositoryImpl repository;
    private BusInfor busInfor;

    private BusInfor getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getService() {
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