package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.Driver;
import za.ac.cputassignment.util.Misc;

public class DriverFactory {

    public static Driver BuilderGeneric(String  driverID,String driverName,String driverLastName,String licanseCode,String race,String gender,int age) {


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
