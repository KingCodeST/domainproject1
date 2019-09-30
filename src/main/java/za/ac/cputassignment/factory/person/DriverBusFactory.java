package za.ac.cputassignment.factory.person;


import za.ac.cputassignment.domain.person.DriverBus;
import za.ac.cputassignment.util.Misc;

public class DriverBusFactory {
    private static  String busDriverName, driverId;
    public static DriverBus GenericBuilder(String driverBus)
    {
        return new DriverBus(busDriverName, Misc.generatedId());
    }

}
