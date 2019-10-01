package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.Race;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void genericBuilder() {
        Race ride=RaceFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}