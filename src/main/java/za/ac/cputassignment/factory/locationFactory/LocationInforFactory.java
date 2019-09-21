package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.CampusLocation;

public class LocationInforFactory {

    public static CampusLocation getLocationInfor(String LinfId)
    {

        return  new CampusLocation.Builder()
                                .id(LinfId)
                                .build();


    }



}
