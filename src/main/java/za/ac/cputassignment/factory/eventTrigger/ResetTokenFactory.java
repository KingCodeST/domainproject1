package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.ResetToken;

public class ResetTokenFactory {

    public static ResetToken GenericBuilder(String token)
    {
        return new ResetToken(token);
    }

}
