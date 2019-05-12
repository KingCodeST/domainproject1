package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.factory.loginFactory.LoginFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginResitoryImplTest {

    private LoginRepository repository;
    private Login login;

    private Login getSavedLogin()
    {
        Set<Login> savedLogin =this.repository.getAll();
        return savedLogin.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =LoginResitoryImpl.getRepository();
        this.login = LoginFactory.getLogin();

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