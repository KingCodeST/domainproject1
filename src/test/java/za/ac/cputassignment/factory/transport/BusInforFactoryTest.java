package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class BusInforFactoryTest {

    @Test
    public void builderGeneric() {
        BusInfor ride=BusInforFactory.BuilderGeneric(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}