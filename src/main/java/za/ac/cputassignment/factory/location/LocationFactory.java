package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.util.Misc;

public class LocationFactory {

    public static Location GenericBuilder( String  locationId,String campusName,String residenceName,String specialLocationName,String sportFieldName
    )
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
