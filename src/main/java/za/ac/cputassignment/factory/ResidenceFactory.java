package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.Residence;

public class ResidenceFactory {


    public static Residence getResidence()
    {
        return  new Residence();
    }


}
