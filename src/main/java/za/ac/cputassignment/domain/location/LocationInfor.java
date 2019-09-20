package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Objects;

@EntityScan
public class LocationInfor {


    private String campusLocation;

    private LocationInfor(){}

    private LocationInfor(Builder builder){
        this.campusLocation =builder.campusLocation;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    public static class Builder{
        private String campusLocation;

        public Builder getCampusLocation(String campusLocation)
        {
            this.campusLocation =campusLocation;
            return this;
        }

        public Builder copy(LocationInfor locationInfor)
        {
            this.campusLocation=locationInfor.campusLocation;
            return this;
        }

        public LocationInfor build()
        {
            return new LocationInfor(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationInfor that = (LocationInfor) o;
        return campusLocation.equals(that.campusLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campusLocation);
    }

    @Override
    public String toString() {
        return "LocationInfor{" +
                "campusLocation='" + campusLocation + '\'' +
                '}';
    }
}
