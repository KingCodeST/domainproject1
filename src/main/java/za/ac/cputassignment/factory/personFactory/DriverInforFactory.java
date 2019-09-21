package za.ac.cputassignment.factory.personFactory;

import za.ac.cputassignment.domain.person.DriverBus;

public class DriverInforFactory {

    public static DriverBus getDriverInfor(String id)
    {
        return new DriverBus.Builder()
                              .id(id)
                                .build();
    }


}
