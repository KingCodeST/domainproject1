package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.Residence;

public class ResidenceFactory {


    public static Residence getResidence(String rname)
    {
        return  new Residence.Builder()

                .residenceName(rname)
                .build();
    }


}
