package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.SpecialLocation;

public class SpecialLocationFactory {


    public static SpecialLocation getSpecialFactory(String nm, String addr, int id)
    {
        return  new SpecialLocation.Builder()
                                   .name(nm)
                                    .address(addr)
                                    .SLocalId(id)
                                    .build();
    }

}
