package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.TimetableInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;

import static org.junit.Assert.*;

public class TimetableInfoServiceImplTest {

    private TimetableInforRepositoryImpl repository;
    private TimetableInfo timetableInfo;

    private TimetableInfo getSaved()
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