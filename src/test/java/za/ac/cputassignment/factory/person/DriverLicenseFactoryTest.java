package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class DriverLicenseFactoryTest {

    @Test
    public void genericBuilder() {
        DriverLicense ride=DriverLicenseFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}