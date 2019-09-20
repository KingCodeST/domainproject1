package za.ac.cputassignment.factory.loginFactory;

public class DisplayWelcomFactory {


    public static DisplayWelcom getDisplayeWelcom(String DsId)
    {
        return  new DisplayWelcom.Builder()
                                 .id(DsId)
                                 .build();
    }

}
