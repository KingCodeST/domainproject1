package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class SpecialLocationFactoryTest {



    @Test
    public void getSpecialFactory() {
        SpecialLocation ride=SpecialLocationFactory.getSpecialFactory(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}