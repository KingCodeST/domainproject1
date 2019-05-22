package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.trasportRepositoryImpl.VanRepositoryImpl;
import za.ac.cputassignment.domain.transport.Van;

import static org.junit.Assert.*;

public class VanServiceImplTest {

    private VanRepositoryImpl repository;
    private Van van;

    private Van getSaved()
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