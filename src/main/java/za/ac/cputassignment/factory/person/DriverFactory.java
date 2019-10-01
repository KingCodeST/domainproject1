package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.util.Misc;

public class DriverFactory {

    private static String  driverID, driverName, driverLastName, licanseCode, race, gender;
    private static int age;
    public static Driver BuilderGeneric(String  driver) {


        return new Driver.Builder()
                        .driverID(Misc.generatedId())
                        .driverName(driverName)
                        .driverLastName(driverLastName)
                        .age(age)
                        .licanseCode(licanseCode)
                        .setGender(gender)
                        .setRace(race)
                        .build();

    }


}
