package za.ac.cputassignment.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.transport.Bus;

import static org.junit.Assert.*;

public class BusFactoryTest {
    Bus b;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getBus() {

        String brand="Toyota";
        int    enginee=564930;
        String sm="MG3439";
        int    num=39;
        String worthy="yes";


        b=new Bus.Builder()
                .brandName(brand)
                .engineNumber(enginee)
                .modelNo(sm)
                .quantity(num)
                .roadWorty(worthy)
                .build();

        Assert.assertNotNull(b);

    }
}