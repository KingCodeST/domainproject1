package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.DriverInfor;

public class DriverInforFactory {

    public static DriverInfor getDriverInfor(String id)
    {
        return new DriverInfor.Builder()
                              .id("1")
                                .build();
    }


}
