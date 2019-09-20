package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.loginRepository.DisplayWelcomRepository;
import za.ac.cputassignment.factory.loginFactory.DisplayWelcomFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DisplayWelcomRepositoryImplTest {

    @Autowired
    private DisplayWelcomRepository repository;
    private String displayWelcomId=null;

    @Test
    public void DisplayWelcomCreated() throws IOException
    {
        DisplayWelcom displayWelcom=DisplayWelcomFactory.getDisplayeWelcom("#901");
        DisplayWelcom result =repository.create(displayWelcom);
        displayWelcomId =result.getId();
        Assert.assertNotNull(displayWelcom);
    }

    @Test
    public void SiteDisplayTest() throws IOException
    {
        DisplayWelcom displayWelcom =repository.read(displayWelcomId);
        Assert.assertNotNull(displayWelcom);
    }


}