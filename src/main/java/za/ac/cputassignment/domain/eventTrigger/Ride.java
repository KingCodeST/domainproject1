package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cputassignment.domain.location.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class Ride {

    private String rideNumber;

    private Ride(){}

    private Ride(Builder builder){
        this.rideNumber =builder.rideNumber;
    }


    public String getRideNumber() {
        return rideNumber;
    }

    public static class Builder{

        private String rideNumber;

        public Builder setRideNumber(String rideNumber){
            this.rideNumber =rideNumber;
            return this;
        }

        public Builder copy(Ride ride){
            this.rideNumber =ride.rideNumber;
            return this;
        }

        public Ride build(){
            return new Ride(this);
        }

    }

}