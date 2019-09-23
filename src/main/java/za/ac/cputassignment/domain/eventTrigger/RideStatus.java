package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Objects;

@EntityScan
public class RideStatus  {

    private String rideStatusId;
    private boolean on=true;



    private RideStatus (){}

    private RideStatus (Builder builder)
    {
        this.on =builder.on;
        this.rideStatusId =builder.rideStatusId;
    }

    public boolean isOn() {
        return on;
    }

    public String getRideStatusId() {
        return rideStatusId;
    }

    public static class Builder{
        private String rideStatusId;

        private boolean on=true;


        public Builder setOn(boolean on){
            this.on =on;
            return this;
        }

        public Builder setRideStatusId(String rideStatusId)
        {
            this.rideStatusId =rideStatusId;
            return this;
        }

       public Builder copy(RideStatus rideStatus){
            this.on =rideStatus.on;
            this.rideStatusId =rideStatus.rideStatusId;
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
