package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SpecialLocationL;
import za.ac.cputassignment.util.Misc;

public class SpecialLocationLFactory {

    public  static SpecialLocationL getSportField(String address,String specialLId)
    {

        return  new SpecialLocationL(address, Misc.generatedId());

    }

}
