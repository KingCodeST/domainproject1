package za.ac.cputassignment.domain.login;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Logout {

    private String id;

    private Logout()
    {

    }


    private Logout(Builder build)
    {
        this.id =id;
    }

    public String getId() {
        return id;
    }

    private static class Builder{

        private String id;

        private Builder id(String id)
        {
            this.id =id;
            return  this;
        }

        private Logout build()
        {
            return new Logout(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logout logout = (Logout) o;
        return id.equals(logout.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Logout{" +
                "id='" + id + '\'' +
                '}';
    }
}
