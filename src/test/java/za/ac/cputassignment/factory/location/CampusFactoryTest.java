package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class CampusFactoryTest {
 private   String name="Distric Six";
    @Before
    public void setUp() throws Exception {
        name="Distric Six";
    }

    @Test
    public void genericBuilder() {
        Campus ride=CampusFactory.GenericBuilder(name);
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}