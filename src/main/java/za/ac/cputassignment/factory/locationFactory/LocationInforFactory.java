package za.ac.cputassignment.factory.locationFactory;

import za.ac.cputassignment.domain.location.LocationInfor;

public class LocationInforFactory {

    public static LocationInfor getLocationInfor(String LinfId)
    {

        return  new LocationInfor.Builder()
                                .id(LinfId)
                                .build();


    }



}
