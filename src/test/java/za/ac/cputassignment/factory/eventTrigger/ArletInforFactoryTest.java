package za.ac.cputassignment.factory.eventTrigger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.util.Misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ArletInforFactoryTest   {


    private String blue,red,green;
//    private String simpledate;
//    DateFormat dtf=new SimpleDateFormat("10/06/2019");
//    Date date=dtf.parse(simpledate);

    public ArletInforFactoryTest() throws ParseException {
    }


    @Before
    public void setup()throws Exception{
        blue ="#000bc123" ;
        red ="#ffff00";
        green="#jgn000";


    }


    @Test
    public void genericBuilder() {

       ArletInfor arlet= ArletInforFactory.GenericBuilder(blue,red,green);
       System.out.println(arlet);
        Assert.assertNotNull(arlet);
    }
}