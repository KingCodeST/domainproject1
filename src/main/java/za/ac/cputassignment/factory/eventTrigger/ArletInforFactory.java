package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.util.Misc;

public class ArletInforFactory {

    public static ArletInfor GenericBuilder(String arletId,String color1,String color2,String color3)
    {
        return new ArletInfor.Builder()
                            .setAlertInforId(Misc.generatedId())
                            .blue(color1)
                            .green(color2)
                            .red(color3)
                            .build();
    }

}
