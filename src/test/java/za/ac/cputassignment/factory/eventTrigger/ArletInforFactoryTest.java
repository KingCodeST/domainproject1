package za.ac.cputassignment.factory.eventTrigger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.util.Misc;

import static org.junit.Assert.*;

public class ArletInforFactoryTest {


    private String blue,red,green;
    private String simpledate;


    @Before
    public void setup()throws Exception{
        blue ="#000bc123" ;
        red ="#ffff00";
        green="#jgn000";

    }


    @Test
    public void genericBuilder() {
       ArletInfor arlet= ArletInforFactory.GenericBuilder(Misc.generatedId());
       System.out.println(arlet);
        Assert.assertNotNull(arlet);
    }
}