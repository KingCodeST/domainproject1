package za.ac.cputassignment.factory.person;


import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.util.Misc;

public class DriverBusFactory {

    public static DriverBus GenericBuilder( String busDriverName,String driverId)
    {
        return new DriverBus(busDriverName, Misc.generatedId());
    }

}
