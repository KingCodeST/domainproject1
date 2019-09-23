package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.CampusLocation;

public class CampusLocationFactory {

    public static CampusLocation GenericBuilder( String address,String campusLocationId)
    {
        return new CampusLocation(address,campusLocationId);
    }

}
