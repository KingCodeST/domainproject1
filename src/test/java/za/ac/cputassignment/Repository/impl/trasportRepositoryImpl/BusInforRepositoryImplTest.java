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
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.factory.transportFactory.BusInforFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class BusInforRepositoryImplTest {

    @Autowired
    private BusInforRepository repository;
    private String busInforId=null;


    @Test
    public void BusInoforTest() throws IOException
    {
        BusInfor busInfor= BusInforFactory.getBusInfor("",2091);
        BusInfor result =repository.create(busInfor);
        busInforId =result.getId();
        Assert.assertNotNull(busInfor);
    }

    @Test
    public void SiteBusInforTest()throws  IOException
    {
        BusInfor busInfor =repository.read(busInforId);
        Assert.assertNotNull(busInfor);
    }




}