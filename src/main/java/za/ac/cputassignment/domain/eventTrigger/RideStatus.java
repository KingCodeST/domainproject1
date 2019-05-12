package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class RideStatus implements Notification {


    @Id
    private String id;

    private RideStatus (){}

    private RideStatus (Builder builder)
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
            return this;
        }

        public RideStatus build()
        {
            return new RideStatus(this);
        }

    }

    @Override
    public void Color() {

    }

    @Override
    public void Distance() {

    }

    @Override
    public void Time() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RideStatus that = (RideStatus) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RideStatus{" +
                "id='" + id + '\'' +
                '}';
    }
}
