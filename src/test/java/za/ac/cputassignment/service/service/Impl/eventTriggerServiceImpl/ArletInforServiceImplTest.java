package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import static org.junit.Assert.*;

public class ArletInforServiceImplTest {

    private ArletInforRepositoryImpl repository;
    private ArletInfor arletInfor;

    private ArletInfor getSaved()
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