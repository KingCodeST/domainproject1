package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class DriverBusFactoryTest {

    @Test
    public void genericBuilder() {
        DriverBus ride=DriverBusFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}