package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.LoginRepository;
import za.ac.cputassignment.domain.login.Login;
import za.ac.cputassignment.factory.loginFactory.LoginFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginResitoryImplTest {

    @Autowired
    private LoginRepository repository;
    private String loginId=null;


    @Test
    public void LoginCreate() throws IOException
    {
        Login login=LoginFactory.getLogin("#09f");
        Login result=repository.create(login);
        loginId =result.getLoginId();
        Assert.assertNotNull(login);
    }

    @Test
    public void SiteLogin() throws IOException
    {
        Login login=repository.read(loginId);
        Assert.assertNotNull(login);
    }


}