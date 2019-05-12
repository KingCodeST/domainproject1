package za.ac.cputassignment.domain.login;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;
@EntityScan
public class Login {

    @Id
    private String loginId;
    private String username;
    private String password;

    private Login (){}


    public Login(Builder builder)
    {
        this.username =builder.username;
        this.password =builder.password;
        this.loginId =builder.loginId;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginId() {
        return loginId;
    }

    public static class Builder
    {
        private String loginId;
        private String username;
        private String password;

        public Builder loginId(String loginId)
        {
            this.loginId =loginId;
            return this;
        }

        public  Builder username(String username)
        {
            this.username =username;
            return this;
        }

        public Builder password(String password)
        {
            this.password =password;
            return this;
        }

        public  Login build()
        {
            return new Login(this);
        }

    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return loginId.equals(login.loginId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId);
    }
}
