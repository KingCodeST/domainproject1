package za.ac.cputassignment.factory.transport;

import za.ac.cputassignment.domain.transport.DiskLicense;
import za.ac.cputassignment.util.Misc;

import java.util.Date;

public class DiskLicenseFactory {


    private static Date expe;
    public static DiskLicense BuilderGeneric(String disklicense)
    {

        return  new DiskLicense.Builder()

                .code(Misc.generatedId())
                .experationDate(expe)
                .build();


    }

}
