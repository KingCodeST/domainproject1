package za.ac.cputassignment.service.service.Impl.LoginServiceImpl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.Repository.impl.loginRepositoryImpl.LogoutRepositoryImpl;

public class LogoutServiceImplTest {

    private LogoutRepositoryImpl repository;
    private Logout logout;

    private Logout getSaved()
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