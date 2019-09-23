package za.ac.cputassignment.factory.person;

import za.ac.cputassignment.domain.person.DriverLicense;

import java.util.Date;

public class DriverLicenseFactory {

    public static DriverLicense GenericBuilder(String code, Date expirationDate)
    {
        return new DriverLicense.Builder()
                .setCode(code)
                .setExpiration(expirationDate)
                .build();
    }


}
