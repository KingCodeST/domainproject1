package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.Campus;

public class CampusFactory {


    public static Campus getCampus(String campId,String cname)
    {
        return new Campus.Builder()
                        .campusid(campId)
                        .campusName(cname)
                        .build();
    }


}
