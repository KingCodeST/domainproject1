package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.util.Misc;

public class LocationFactory {

    private static String  locationId, campusName, residenceName, specialLocationName, sportFieldName;
    public static Location GenericBuilder( String  location)
    {
        return new Location.Builder()
                            .setCampusName(Misc.generatedId())
                            .setLocationId(campusName)
                            .setResidenceName(residenceName)
                            .setSpecialLocationName(specialLocationName)
                            .setSportFieldName(sportFieldName)
                            .build();
    }


}
