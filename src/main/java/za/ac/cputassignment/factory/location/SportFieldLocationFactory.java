package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.util.Misc;

public class SportFieldLocationFactory {

        private static String address, sportFiledId;
    public  static SportFieldLocation getSportField( String sportFieldLocation)
    {

        return  new SportFieldLocation(address, Misc.generatedId());

    }

}
