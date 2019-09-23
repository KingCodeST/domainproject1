package za.ac.cputassignment.factory.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.LogEvent;

public class LogEventFactory {

    public static LogEvent BuildGenericResponseObj(String responseCode,String responseDescription){
        return new LogEvent(responseCode,responseDescription);
    }

}
