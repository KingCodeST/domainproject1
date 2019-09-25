package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Residence;
import za.ac.cputassignment.util.Misc;

public class ResidenceFactory {


    public static Residence getResidence(String rname)
    {
        return  new Residence.Builder()
                .residenceId(Misc.generatedId())
                .residenceName(rname)
                .build();
    }


}
