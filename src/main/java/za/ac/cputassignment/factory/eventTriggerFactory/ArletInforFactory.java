package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

public class ArletInforFactory {

    public ArletInfor getArlet()
    {
        return new ArletInfor.Builder()
                             .id("1")
                            .blue("Blue")
                            .green("Green")
                            .red("Red")
                            .build();
    }

}
