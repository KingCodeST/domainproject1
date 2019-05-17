package za.ac.cputassignment.factory.loginFactory;

import za.ac.cputassignment.domain.login.DisplayWelcom;

public class DisplayWelcomFactory {


    public static DisplayWelcom getDisplayeWelcom(String DsId)
    {
        return  new DisplayWelcom.Builder()
                                 .id(DsId)
                                 .build();
    }

}
