package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Objects;

@EntityScan
public class RideStatus  {

    private boolean on=true;



    private RideStatus (){}

    private RideStatus (Builder builder)
    {
        this.on =builder.on;
    }

    public boolean isOn() {
        return on;
    }

    public static class Builder{

        private boolean on=true;


        public Builder setOn(boolean on){
            this.on =on;
            return this;
        }

       public Builder copy(RideStatus rideStatus){
            this.on =on;
            return this;
       }

        public RideStatus build()
        {
            return new RideStatus(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RideStatus that = (RideStatus) o;
        return on == that.on;
    }

    @Override
    public int hashCode() {
        return Objects.hash(on);
    }

    @Override
    public String toString() {
        return "RideStatus{" +
                "on=" + on +
                '}';
    }
}
