package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class VanFactoryTest {

    @Test
    public void getVan() {
        Van ride=VanFactory.getVan(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}