package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SpecialLocationL;

public class SpecialLocationLFactory {

    public  static SpecialLocationL getSportField(String address,String specialLId)
    {

        return  new SpecialLocationL(address,specialLId);

    }

}
