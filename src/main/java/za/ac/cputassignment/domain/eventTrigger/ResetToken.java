package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;

@EntityScan
public class ResetToken {

    @Id
    private String id;
    private String token;

    public ResetToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ResetToken{" +
                "token='" + token + '\'' +
                '}';
    }
}
