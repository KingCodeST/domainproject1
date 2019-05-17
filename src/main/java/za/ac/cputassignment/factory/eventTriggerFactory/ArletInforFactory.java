package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

public class ArletInforFactory {

    public ArletInfor getArlet(String arletId,String color1,String color2,String color3)
    {
        return new ArletInfor.Builder()
                             .id(arletId)
                            .blue(color1)
                            .green(color2)
                            .red(color3)
                            .build();
    }

}
