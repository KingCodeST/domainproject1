package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.util.Misc;

public class CampusFactory {


    public static Campus GenericBuilder(String campId,String cname)
    {
        return new Campus.Builder()
                        .campusid(Misc.generatedId())
                        .campusName(cname)
                        .build();
    }


}
