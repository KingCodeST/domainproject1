package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.SportField;

public class SportFieldFactory {


    public  static SportField getSportField(int id,String addrss,String name)
    {

        return  new SportField.Builder()
                              .sFieldID(id)
                              .address(addrss)
                              .fname(name)
                              .build();

    }

}
