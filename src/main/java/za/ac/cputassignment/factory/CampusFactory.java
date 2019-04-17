package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.location.Campus;

public class CampusFactory {


    public static Campus getCampus(String cname)
    {
        return new Campus.Builder()
                        .campusName(cname)

                        .build();
    }


}
