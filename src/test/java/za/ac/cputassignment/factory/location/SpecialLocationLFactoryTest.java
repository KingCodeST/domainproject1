package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class SpecialLocationLFactoryTest {

    @Test
    public void getSportField() {
        SpecialLocationL ride=SpecialLocationLFactory.getSportField(Misc.generatedId());
        System.out.println("/"+ride);
        Assert.assertNotNull(ride);
    }
}