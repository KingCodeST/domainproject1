package za.ac.cputassignment.factory;

import za.ac.cputassignment.domain.BusDriver;

public class BusDriverFactory {

        public static BusDriver getBusDriver(String driverName,String driverLastName,String licanseCode,int age)
        {
            return new BusDriver.Builder().age(age)
                    .driverName(driverName)
                    .driverLastName(driverLastName)
                    .licanseCode(licanseCode)

                    .build();

        }


}
