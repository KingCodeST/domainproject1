package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class ResetToken {

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
