package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.DiskLicense;

public class DiskLicenseFactory {

    public static DiskLicense BuilderGeneric(String licenseCode,String expe)
    {

        return  new DiskLicense.Builder()
                .code(licenseCode)
                .experationDate(expe)
                .build();


    }

}
