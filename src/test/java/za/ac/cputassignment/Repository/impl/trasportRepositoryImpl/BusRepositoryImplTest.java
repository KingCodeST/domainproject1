package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.trasportRepository.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.factory.transportFactory.BusFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusRepositoryImplTest {

    @Autowired
    private BusRepository repository;
    private String busId=null;


    @Test
    public void BusCreateTest() throws IOException
    {
        Bus bus =BusFactory.getBus("Toyota",54350,"324%",454,"Yes");
        Bus result= repository.create(bus);
        busId =result.getId();
        Assert.assertNotNull(bus);

    }

    @Test
    public void SiteBusTest() throws IOException
    {
        Bus bus =repository.read(busId);
        Assert.assertNotNull(bus);
    }



}