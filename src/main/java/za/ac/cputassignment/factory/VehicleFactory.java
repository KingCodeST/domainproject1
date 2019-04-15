package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.transport.Vehicle;

public class VehicleFactory {


    public  static Vehicle getVehicle()
    {
        return  new Vehicle();
    }


}
