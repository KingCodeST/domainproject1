package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SpecialLocation;
import za.ac.cputassignment.util.Misc;

public class SpecialLocationFactory {

        private static String nm,  addr, id;
    public static SpecialLocation getSpecialFactory(String speciallocation)
    {
        return  new SpecialLocation.Builder()

                                   .name(nm)
                                    .address(addr)
                                    .SLocalId(Misc.generatedId())
                                    .build();
    }

}
