package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.SportFieldRepositoryImpl;
import za.ac.cputassignment.domain.location.SportField;

import static org.junit.Assert.*;

public class SportFieldServiceImplTest {

    private SportFieldRepositoryImpl repository;
    private SportField sportField;

    private SportField getSaved()
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