package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class ResidenceLocation {

    private String residenceLocation, residenceLocationId;

    private ResidenceLocation(){}

    public ResidenceLocation(String residenceLocation,String residenceLocationId)
    {
        this.residenceLocation = residenceLocation;
        this.residenceLocationId =residenceLocationId;
    }

    public String getResidenceLocation() {
        return residenceLocation;
    }

    public String getResidenceLocationId() {
        return residenceLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidenceLocation that = (ResidenceLocation) o;
        return residenceLocationId.equals(that.residenceLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residenceLocationId);
    }

    @Override
    public String toString() {
        return "ResidenceLocation{" +
                "residenceLocation='" + residenceLocation + '\'' +
                ", residenceLocationId='" + residenceLocationId + '\'' +
                '}';
    }
}
