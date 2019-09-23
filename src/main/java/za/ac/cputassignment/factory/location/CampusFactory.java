package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Campus;

public class CampusFactory {


    public static Campus GenericBuilder(String campId,String cname)
    {
        return new Campus.Builder()
                        .campusid(campId)
                        .campusName(cname)
                        .build();
    }


}
