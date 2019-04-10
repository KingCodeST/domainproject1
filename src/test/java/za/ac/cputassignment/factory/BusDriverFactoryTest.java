package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.BusDriver;

import static org.junit.Assert.*;

public class BusDriverFactoryTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getBusDriver() {

        String name ="Michael ";
        String lname="valia";
        String license="code19";
        int     age=34;
        BusDriver s=BusDriverFactory.getBusDriver(name,lname,license,age);

        System.out.println(s);
        Assert.assertNotNull(s.getDriverName());


    }
}