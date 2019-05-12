package za.ac.cputassignment.domain.login;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class DisplayWelcom {
    @Id
    private String id;


    private DisplayWelcom()
    {}

    private DisplayWelcom(Builder builder)
    {
        this.id =builder.id;
    }

    public String getId() {
        return id;
    }

    public static class Builder{

        private String id;

        public Builder id(String id)
        {
            this.id =id;
            return  this;
        }

        public DisplayWelcom build()
        {
            return new DisplayWelcom(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisplayWelcom that = (DisplayWelcom) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
