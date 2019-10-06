package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cputassignment.domain.location.Location;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class Ride {

    @Id
    private String id;
    private String rideNumber;
    private String nameTrip;

    private Ride(){}

    private Ride(Builder builder){
        this.rideNumber =builder.rideNumber;
        this.nameTrip =builder.nameTrip;
    }


    public String getRideNumber() {
        return rideNumber;
    }

    public String getNameTrip() {
        return nameTrip;
    }

    public static class Builder{

        private String rideNumber;
        private String nameTrip;

        public Builder setRideNumber(String rideNumber){
            this.rideNumber =rideNumber;
            return this;
        }

        public Builder setNameTrip(String nameTrip)
        {
            this.nameTrip =nameTrip;
            return this;
        }

        public Builder copy(Ride ride){
            this.rideNumber =ride.rideNumber;
            this.nameTrip =ride.nameTrip;
            return this;
        }

        public Ride build(){
            return new Ride(this);
        }

    }

}