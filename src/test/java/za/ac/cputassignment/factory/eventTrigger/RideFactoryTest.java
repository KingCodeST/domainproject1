package za.ac.cputassignment.factory.eventTrigger;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.eventTrigger.Ride;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class RideFactoryTest {

    @Test
    public void genericBuilder() {
        Ride ride= RideFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}