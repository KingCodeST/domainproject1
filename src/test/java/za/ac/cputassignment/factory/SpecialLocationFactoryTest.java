package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.location.SpecialLocation;

public class SpecialLocationFactoryTest {
        SpecialLocation sp;

    @Before
    public void setUp() throws Exception {
        sp =new SpecialLocation.Builder()
                               .name("SamVille")
                                .address("1836 Tambo square ")
                                .build();
    }

    @Test
    public void getSpecialFactory() {



        Assert.assertNotNull(sp);

    }
}