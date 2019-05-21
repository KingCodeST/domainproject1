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
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.factory.transportFactory.VanFactory;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;

import static za.ac.cputassignment.factory.transportFactory.VanFactory.getVan;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class VanRepositoryImplTest {

    @Autowired
    private VanRepositoryImpl repository;
    private String vanID=null;


    @Test
    public void VanCreatedTest() throws IOException
    {
        Van van =VanFactory.getVan("#","Toyota","#CA5343",45.7);
        Van result =repository.create(van);
        vanID =result.getVanId();
        Assert.assertNotNull(van);
    }

    @Test
    public void SiteVanTest() throws IOException
    {
        Van van =repository.read(vanID);
        Assert.assertNotNull(van);
    }


}