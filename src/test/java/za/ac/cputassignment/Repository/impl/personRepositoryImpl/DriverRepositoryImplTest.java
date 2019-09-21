package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.factory.personFactory.BusDriverFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverRepositoryImplTest {

    @Autowired
    private BusDriverRepository repository;
    private String busDriverId=null;

    @Test
    public void BusDriverCreateTest() throws IOException
    {
        Driver driver =BusDriverFactory.getBusDriver("Luke","Van","C10",78);
        Driver result =repository.create(driver);
        busDriverId =result.getDriverID();
        Assert.assertNotNull(driver);
    }


    @Test
    public void SiteBusDriverTest() throws IOException
    {
        Driver driver =repository.read(busDriverId);
        Assert.assertNotNull(driver);
    }

}