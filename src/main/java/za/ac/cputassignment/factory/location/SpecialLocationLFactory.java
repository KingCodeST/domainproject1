package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.util.Misc;

public class SpecialLocationLFactory {

    private static String address, specialLId;
    public  static SpecialLocationL getSportField(String s)
    {

        return  new SpecialLocationL(address, Misc.generatedId());

    }

}
