package za.ac.cputassignment.factory.transport;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class VehicleFactoryTest {
    private String type;
    private String diskicencse;

    @Before
    public void setup(){
        type="conveteble";
        diskicencse ="#fadfe1243";
    }

    @Test
    public void builderGeneric() {
        Vehicle ride=VehicleFactory.BuilderGeneric(diskicencse,type,Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}