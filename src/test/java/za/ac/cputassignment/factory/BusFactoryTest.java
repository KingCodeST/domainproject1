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
    public void getBus(String brandname,int engine,String model,int quanti,String roadworthy) {

        String brand="Toyota";
        int    enginee=564930;
        String sm="MG3439";
        int    num=39;
        String worthy="yes";


        b=new Bus.Builder()
                .brandName(brandname)
                .engineNumber(engine)
                .modelNo(model)
                .quantity(quanti)
                .roadWorty(roadworthy)
                .build();

     Assert.assertNull(b.getBrandName());



    }
}