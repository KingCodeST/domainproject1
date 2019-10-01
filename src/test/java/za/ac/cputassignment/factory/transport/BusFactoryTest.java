package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Bus;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class BusFactoryTest {

    @Test
    public void getBus() {
        Bus ride=BusFactory.getBus(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}