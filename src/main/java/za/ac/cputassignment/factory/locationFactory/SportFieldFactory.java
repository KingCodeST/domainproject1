package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.SportField;

public class SportFieldFactory {


    public  static SportField getSportField(int fid,String id, String addrss, String name)
    {

        return  new SportField.Builder()
                              .id(id)
                              .sFieldID(fid)
                              .address(addrss)
                              .fname(name)
                              .build();

    }

}
