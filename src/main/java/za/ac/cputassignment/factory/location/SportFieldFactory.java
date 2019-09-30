package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SportField;
import za.ac.cputassignment.util.Misc;

public class SportFieldFactory {

    private static String fieldid, id, addrss, name;
    public  static SportField getSportField(String sportField)
    {

        return  new SportField.Builder()
                              .sFieldID(Misc.generatedId())
                              .address(addrss)
                              .fname(name)
                              .build();

    }

}
