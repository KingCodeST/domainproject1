package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.DisplayWelcomRepositoryImpl;

public class DisplayWelcomServiceImplTest {

    private DisplayWelcomRepositoryImpl repository;
    private DisplayWelcom displayWelcom;

    private DisplayWelcom getSaved()
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