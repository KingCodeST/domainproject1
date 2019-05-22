package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.RideRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import static org.junit.Assert.*;

public class RideServiceImplTest {

    private RideRepositoryImpl repository;
    private Ride ride;

    private Ride getSaved()
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