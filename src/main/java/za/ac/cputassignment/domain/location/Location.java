package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class Location {

    private String  LocationId,campusName,residenceName,specialLocationName,SportFieldName;

    private Location(){}

    public String getLocationId() {
        return LocationId;
    }

    public void setLocationId(String locationId) {
        LocationId = locationId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public void setResidenceName(String residenceName) {
        this.residenceName = residenceName;
    }

    public String getSpecialLocationName() {
        return specialLocationName;
    }

    public void setSpecialLocationName(String specialLocationName) {
        this.specialLocationName = specialLocationName;
    }

    public String getSportFieldName() {
        return SportFieldName;
    }

    public void setSportFieldName(String sportFieldName) {
        SportFieldName = sportFieldName;
    }

    @Override
    public String toString() {
        return "Location{" +
                "LocationId='" + LocationId + '\'' +
                ", campusName='" + campusName + '\'' +
                ", residenceName='" + residenceName + '\'' +
                ", specialLocationName='" + specialLocationName + '\'' +
                ", SportFieldName='" + SportFieldName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return LocationId.equals(location.LocationId) &&
                Objects.equals(campusName, location.campusName) &&
                Objects.equals(residenceName, location.residenceName) &&
                Objects.equals(specialLocationName, location.specialLocationName) &&
                Objects.equals(SportFieldName, location.SportFieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LocationId);
    }
}
