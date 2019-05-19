package za.ac.cputassignment.domain.login;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class DisplayError {

    @Id
    private String Displayeid;

    private DisplayError(){

    }

    private DisplayError(Builder build)
    {
        this.Displayeid =build.Displayeid;

    }

    public String getId() {
        return Displayeid;
    }

    public static class Builder{

        private String Displayeid;

        public Builder id(String Displayeid)
        {
            this.Displayeid =Displayeid;
            return this;
        }

        public DisplayError buid()
        {
            return new DisplayError(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisplayError that = (DisplayError) o;
        return Displayeid.equals(that.Displayeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Displayeid);
    }

    @Override
    public String toString() {
        return "DisplayError{" +
                "id='" + Displayeid + '\'' +
                '}';
    }
}
