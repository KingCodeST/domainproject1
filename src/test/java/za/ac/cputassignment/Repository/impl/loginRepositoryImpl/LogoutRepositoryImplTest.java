package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.LogoutRepository;
import za.ac.cputassignment.factory.loginFactory.LogoutFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LogoutRepositoryImplTest {

    @Autowired
    private LogoutRepository repository;
    private String logoutId=null;


    @Test
    public void LogoutCreate() throws IOException
    {
        Logout logout=LogoutFactory.getLogout("#432");
        Logout result =repository.create(logout);
        logoutId =result.getId();
        Assert.assertNotNull(logout);
    }

    @Test
    public void SiteLogoutTest() throws  IOException
    {
        Logout logout =repository.read(logoutId);
        Assert.assertNotNull(logout);
    }


}