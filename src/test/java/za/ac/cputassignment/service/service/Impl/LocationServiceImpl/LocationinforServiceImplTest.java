package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.LocationInforRepositoryImpl;
import za.ac.cputassignment.domain.location.LocationInfor;

import static org.junit.Assert.*;

public class LocationinforServiceImplTest {

    private LocationInforRepositoryImpl repository;
    private LocationInfor locationInfor;

    private LocationInfor getSaved()
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