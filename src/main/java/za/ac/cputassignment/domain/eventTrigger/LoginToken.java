package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class LoginToken {

    @Id
    private String id;
    private String email;
    private String token;

    private LoginToken(){}

    private LoginToken(Builder builder)
    {
        this.email =builder.email;
        this.token =builder.token;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

    public static class Builder
    {
        private String email;
        private String token;

        public Builder getEmail(String email){
            this.email =email;
            return this;
        }

        public Builder getToken(String token)
        {
            this.token =token;
            return this;
        }

        public Builder copy(LoginToken loginToken)
        {
            this.token =loginToken.token;
            this.email =loginToken.email;
            return this;
        }

        public LoginToken build()
        {
            return new LoginToken(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginToken that = (LoginToken) o;
        return email.equals(that.email) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "LoginToken{" +
                "email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
