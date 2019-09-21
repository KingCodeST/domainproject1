package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

public class ArletInforFactory {

    public static ArletInfor getArlet(String arletId,String color1,String color2,String color3)
    {
        return new ArletInfor.Builder()
                            .blue(color1)
                            .green(color2)
                            .red(color3)
                            .build();
    }

}
