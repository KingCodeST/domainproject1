package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.Driver;

public class BusDriverFactory {

        public static Driver getBusDriver(String driverName, String driverLastName, String licanseCode, int age)
        {
            return new Driver.Builder().age(age)
                    .driverName(driverName)
                    .driverLastName(driverLastName)
                    .licanseCode(licanseCode)
                    .build();

        }


}
