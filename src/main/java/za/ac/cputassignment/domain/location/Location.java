package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class Location {

    private String  locationId,campusName,residenceName,specialLocationName,sportFieldName;

    private Location(){}

    public Location(Builder builder){
        this.campusName =builder.campusName;
        this.locationId =builder.locationId;
        this.residenceName =builder.residenceName;
        this.specialLocationName= builder.specialLocationName;
        this.sportFieldName =builder.sportFieldName;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getCampusName() {
        return campusName;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public String getSpecialLocationName() {
        return specialLocationName;
    }

    public String getSportFieldName() {
        return sportFieldName;
    }

    public static class Builder{
        private String  locationId,campusName,residenceName,specialLocationName,sportFieldName;

        public Builder setLocationId(String locationId){
            this.locationId =locationId;
            return this;
        }

        public Builder setCampusName(String campusName){
            this.campusName =campusName;
            return this;
        }

        public Builder setResidenceName(String residenceName){
            this.residenceName =residenceName;
            return this;
        }

        public Builder setSpecialLocationName(String specialLocationName)
        {
            this.specialLocationName =specialLocationName;
            return this;
        }

        public Builder setSportFieldName(String sportFieldName)
        {
            this.sportFieldName =sportFieldName;
            return this;
        }

        public Builder copy(Location location)
        {
            this.sportFieldName =location.sportFieldName;
            this.specialLocationName =location.specialLocationName;
            this.residenceName =location.residenceName;
            this.campusName =location.campusName;
            this.locationId =location.locationId;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId.equals(location.locationId) &&
                Objects.equals(campusName, location.campusName) &&
                Objects.equals(residenceName, location.residenceName) &&
                Objects.equals(specialLocationName, location.specialLocationName) &&
                Objects.equals(sportFieldName, location.sportFieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId);
    }
}
