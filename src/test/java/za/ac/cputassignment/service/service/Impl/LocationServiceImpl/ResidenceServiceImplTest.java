package za.ac.cputassignment.service.service.Impl.LocationServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.locationRepositoryImpl.ResidenceRepositoryImpl;
import za.ac.cputassignment.domain.location.Residence;

import static org.junit.Assert.*;

public class ResidenceServiceImplTest {

    private ResidenceRepositoryImpl repository;
    private Residence residence;

    private Residence getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAll1() {
    }

    @Test
    public void create1() {
    }

    @Test
    public void read1() {
    }

    @Test
    public void update1() {
    }

    @Test
    public void delete1() {
    }
}