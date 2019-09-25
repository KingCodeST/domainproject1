package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.util.Misc;

public class SportFieldFactory {


    public  static SportField getSportField(String fieldid,String id, String addrss, String name)
    {

        return  new SportField.Builder()
                              .sFieldID(Misc.generatedId())
                              .address(addrss)
                              .fname(name)
                              .build();

    }

}
