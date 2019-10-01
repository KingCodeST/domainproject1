package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class DiskLicenseFactoryTest {

    @Test
    public void builderGeneric() {
        DiskLicense ride=DiskLicenseFactory.BuilderGeneric(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}