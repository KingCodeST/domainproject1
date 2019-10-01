package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class LocationFactoryTest {

    @Test
    public void genericBuilder() {
        Location ride=LocationFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}