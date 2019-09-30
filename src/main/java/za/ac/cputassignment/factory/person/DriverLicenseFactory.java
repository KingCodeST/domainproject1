package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.DriverLicense;
import za.ac.cputassignment.util.Misc;

import java.util.Date;

public class DriverLicenseFactory {
        private static String code;
   private static Date expirationDate;
    public static DriverLicense GenericBuilder(String driverLicense)
    {
        return new DriverLicense.Builder()

                .setCode(Misc.generatedId())
                .setExpiration(expirationDate)
                .build();
    }


}
