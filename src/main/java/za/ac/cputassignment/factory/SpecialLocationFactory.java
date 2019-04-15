package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.SpecialLocation;

public class SpecialLocationFactory {


    public static SpecialLocation getSpecialFactory()
    {
        return  new SpecialLocation();
    }

}
