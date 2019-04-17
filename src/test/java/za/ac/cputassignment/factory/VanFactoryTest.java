package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Van;

import static org.junit.Assert.*;

public class VanFactoryTest {
    Van car;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getVan() {

        car=new Van.Builder()

                .numPlate("CA323")
                .brand("Farrari")
                .patrol(50.0)
                .build();

        Assert.assertNotNull(car);

    }
}