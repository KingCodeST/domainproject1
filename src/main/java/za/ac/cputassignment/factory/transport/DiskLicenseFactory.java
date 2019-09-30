package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.DiskLicense;

public class DiskLicenseFactory {

    private static String licenseCode, expe;
    public static DiskLicense BuilderGeneric(String disklicense)
    {

        return  new DiskLicense.Builder()

                .code(licenseCode)
                .experationDate(expe)
                .build();


    }

}
