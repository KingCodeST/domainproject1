package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.SpecialLocationRepositoryImpl;
import za.ac.cputassignment.domain.location.SpecialLocation;

import static org.junit.Assert.*;

public class SpecialLocationServiceImplTest {

    private SpecialLocationRepositoryImpl repository;
    private SpecialLocation specialLocation;

    private SpecialLocation getSaved()
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