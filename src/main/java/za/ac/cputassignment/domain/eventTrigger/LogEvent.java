package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class LogEvent {

    @Id
    private String id;
    private String responseCode, responseDescription;
    private Object response;

    public LogEvent(String responseCode, String responseDescription) {
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", response=" + response +
                '}';
    }
}
