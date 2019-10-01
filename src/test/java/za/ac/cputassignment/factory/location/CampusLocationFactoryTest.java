package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class CampusLocationFactoryTest {

    @Test
    public void genericBuilder() {
        CampusLocation ride=CampusLocationFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);

    }
}