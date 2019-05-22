package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.domain.location.SpecialLocation;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
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