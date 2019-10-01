package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class SportFieldFactoryTest {

    @Test
    public void getSportField() {
        SportField ride=SportFieldFactory.getSportField(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}