package za.ac.cputassignment.factory.eventTriggerFactory;

import za.ac.cputassignment.domain.eventTrigger.LogEvent;

public class LogEventFactory {

    public static LogEvent BuildGenericResponseObj(String responseCode,String responseDescription){
        return new LogEvent(responseCode,responseDescription);
    }

}
