package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.domain.login.Logout;
import za.ac.cputassignment.factory.loginFactory.LogoutFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LogoutRepositoryImplTest {

    private LogoutRepository repository;
    private Logout logout;

    private Logout getSavedLogout()
    {
        Set<Logout> savedLogout =this.repository.getAll();
        return savedLogout.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository =LogoutRepositoryImpl.getRepository();
        this.logout = LogoutFactory.getLogout();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}