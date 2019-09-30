package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.util.Misc;

public class ArletInforFactory {


    public static ArletInfor GenericBuilder(String color)
    {
        return new ArletInfor.Builder()
                            .setAlertInforId(Misc.generatedId())
                            .green(color)
                            .blue(color)
                            .red(color)
                            .build();
    }

}
