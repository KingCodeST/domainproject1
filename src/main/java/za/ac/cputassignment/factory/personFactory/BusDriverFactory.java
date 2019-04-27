package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.BusDriver;

public class BusDriverFactory {

        public static BusDriver getBusDriver(String driverName,String driverLastName, String licanseCode,int age)
        {
            return new BusDriver.Builder().age(age)
                    .driverName(driverName)
                    .driverLastName(driverLastName)
                    .licanseCode(licanseCode)
                    .build();

        }


}
