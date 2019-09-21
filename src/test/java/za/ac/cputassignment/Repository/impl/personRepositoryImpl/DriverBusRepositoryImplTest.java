package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.DriverInforRepository;
import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.factory.personFactory.DriverInforFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverBusRepositoryImplTest {

    @Autowired
    private DriverInforRepository repository;
    private String driverInfor=null;


    @Test
    public void DriverCreatedTest() throws IOException
    {
        DriverBus busDriver = DriverInforFactory.getDriverInfor("#524");
        DriverBus result =repository.create(busDriver);
        driverInfor =result.getDriverId();
        Assert.assertNotNull(busDriver);
    }

    @Test
    public void SiteDriverTest() throws IOException
    {
        DriverBus driverBusO =repository.read(driverInfor);
        Assert.assertNotNull(driverBusO);
    }


}