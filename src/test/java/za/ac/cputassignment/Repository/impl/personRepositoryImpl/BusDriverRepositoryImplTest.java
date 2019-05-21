package za.ac.cputassignment.Repository.impl.personRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.personFactory.BusDriverFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusDriverRepositoryImplTest {

    @Autowired
    private BusDriverRepository repository;
    private String busDriverId=null;

    @Test
    public void BusDriverCreateTest() throws IOException
    {
        BusDriver busDriver=BusDriverFactory.getBusDriver("Luke","Van","C10",78);
        BusDriver result =repository.create(busDriver);
        busDriverId =result.getDriverID();
        Assert.assertNotNull(busDriver);
    }


    @Test
    public void SiteBusDriverTest() throws IOException
    {
        BusDriver busDriver =repository.read(busDriverId);
        Assert.assertNotNull(busDriver);
    }

}