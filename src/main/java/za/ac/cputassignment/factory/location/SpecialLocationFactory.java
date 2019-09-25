package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.util.Misc;

public class SpecialLocationFactory {


    public static SpecialLocation getSpecialFactory(String nm, String addr,String id)
    {
        return  new SpecialLocation.Builder()

                                   .name(nm)
                                    .address(addr)
                                    .SLocalId(Misc.generatedId())
                                    .build();
    }

}
