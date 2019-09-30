package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.CampusLocation;
import za.ac.cputassignment.util.Misc;

public class CampusLocationFactory {
        private static String address, campusLocationId;
    public static CampusLocation GenericBuilder(String campusLocation )
    {
        return new CampusLocation(address, Misc.generatedId());
    }

}
