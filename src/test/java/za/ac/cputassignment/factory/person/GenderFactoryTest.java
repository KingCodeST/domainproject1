package za.ac.cputassignment.factory.person;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cputassignment.domain.person.Gender;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void genericBuilder() {
        Gender ride=GenderFactory.GenericBuilder(Misc.generatedId());
        System.out.println(ride);
        Assert.assertNotNull(ride);
    }
}