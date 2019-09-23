package za.ac.cputassignment.factory.person;


import za.ac.cputassignment.domain.person.DriverBus;

public class DriverBusFactory {

    public static DriverBus GenericBuilder( String busDriverName,String driverId)
    {
        return new DriverBus(busDriverName,driverId);
    }

}
