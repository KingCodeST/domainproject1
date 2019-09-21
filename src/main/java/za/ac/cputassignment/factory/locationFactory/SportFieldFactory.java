package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.SportField;

public class SportFieldFactory {


    public  static SportField getSportField(String fieldid,String id, String addrss, String name)
    {

        return  new SportField.Builder()

                              .sFieldID(fieldid)
                              .address(addrss)
                              .fname(name)
                              .build();

    }

}
