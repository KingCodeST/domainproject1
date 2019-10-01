package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class SportFieldLocationFactoryTest {

    @Test
    public void getSportField() {
        SportFieldLocation ride=SportFieldLocationFactory.getSportField(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}