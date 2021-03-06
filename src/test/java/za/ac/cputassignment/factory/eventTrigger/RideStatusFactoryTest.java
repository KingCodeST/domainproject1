package za.ac.cputassignment.factory.eventTrigger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.eventTrigger.RideStatus;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class RideStatusFactoryTest {

    private Boolean status;

    @Before
    public void setup() throws Exception
    {
        this.status = true;
    }

    @Test
    public void genericBuilder() {
        RideStatus ride=RideStatusFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}