package za.ac.cputassignment.domain.login;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class DisplayError {

    @Id
    private String id;

    private DisplayError(){

    }

    private DisplayError(Builder build)
    {
        this.id =build.id;

    }

    public String getId() {
        return id;
    }

    public static class Builder{

        private String id;

        public Builder id(String id)
        {
            this.id =id;
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
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DisplayError{" +
                "id='" + id + '\'' +
                '}';
    }
}
