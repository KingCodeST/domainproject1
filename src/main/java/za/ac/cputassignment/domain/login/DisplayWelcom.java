package za.ac.cputassignment.domain.login;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class DisplayWelcom {

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

    private static class Builder{

        private String id;

        private Builder id(String id)
        {
            this.id =id;
            return  this;
        }

        private DisplayWelcom build()
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
