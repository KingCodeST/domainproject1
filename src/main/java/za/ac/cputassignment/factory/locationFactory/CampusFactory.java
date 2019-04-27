package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.Campus;

public class CampusFactory {


    public static Campus getCampus(String cname)
    {
        return new Campus.Builder()
                        .campusName(cname)

                        .build();
    }


}
