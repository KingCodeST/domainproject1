package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.factory.loginFactory.LoginFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
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