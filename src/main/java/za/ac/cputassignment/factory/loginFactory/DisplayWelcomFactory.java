package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.DisplayWelcom;

public class DisplayWelcomFactory {


    public static DisplayWelcom getDisplayeWelcom()
    {
        return  new DisplayWelcom.Builder()
                                 .id("#12346")
                                 .build();
    }

}
