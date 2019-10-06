package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.util.Misc;

public class ArletInforFactory {


    public static ArletInfor GenericBuilder(String color1,String color2,String color3)
    {
        return new ArletInfor.Builder()
                            .setAlertInforId(Misc.generatedId())
                            .green(color1)
                            .blue(color2)
                            .red(color3)
                            .build();
    }

}
