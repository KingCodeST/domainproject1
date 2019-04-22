package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.eventTriggs.Ride;

import static org.junit.Assert.*;

public class RideFactoryTest {
        Ride rd;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRide() {
        String cl="Black";

        rd =new Ride.Builder()
                    .color(cl)
                    .build();

        Assert.assertNotNull(rd);
    }
}