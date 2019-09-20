package za.ac.cputassignment.factory.transportFactory;

public class TimetableInfoFactory {


    public static TimetableInfo getTimetableInfo(String Tid)
    {


        return  new TimetableInfo.Builder()
                                .Id(Tid)
                                .build();


    }


}
