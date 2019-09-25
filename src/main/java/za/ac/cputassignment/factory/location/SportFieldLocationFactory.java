package za.ac.cputassignment.factory.location;

import za.ac.cputassignment.domain.location.SportFieldLocation;
import za.ac.cputassignment.util.Misc;

public class SportFieldLocationFactory {

    public  static SportFieldLocation getSportField( String address,String sportFiledId)
    {

        return  new SportFieldLocation(address, Misc.generatedId());

    }

}
