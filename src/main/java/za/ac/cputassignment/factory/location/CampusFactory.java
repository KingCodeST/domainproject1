package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.util.Misc;

public class CampusFactory {

    private static String campId, cname;
    public static Campus GenericBuilder(String campus)
    {
        return new Campus.Builder()
                        .campusid(Misc.generatedId())
                        .campusName(cname)
                        .build();
    }


}
