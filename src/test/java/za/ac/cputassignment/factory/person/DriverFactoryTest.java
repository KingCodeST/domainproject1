package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class DriverFactoryTest {

    @Test
    public void builderGeneric() {
        Driver ride=DriverFactory.BuilderGeneric(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}