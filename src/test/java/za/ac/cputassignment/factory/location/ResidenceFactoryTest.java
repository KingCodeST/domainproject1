package za.ac.cputassignment.factory.location;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class ResidenceFactoryTest {

    @Test
    public void getResidence() {
        Residence ride=ResidenceFactory.getResidence(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}