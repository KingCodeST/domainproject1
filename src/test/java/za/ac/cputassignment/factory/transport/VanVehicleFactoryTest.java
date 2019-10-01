package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.VanVehicle;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class VanVehicleFactoryTest {

    @Test
    public void builderGeneric() {
        VanVehicle ride=VanVehicleFactory.BuilderGeneric(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}