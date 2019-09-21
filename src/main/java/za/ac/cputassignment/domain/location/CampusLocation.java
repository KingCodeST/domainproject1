package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class CampusLocation {

    private String address, campusLocationId;


    private CampusLocation(){}

    public CampusLocation(String address,String campusLocationId){
        this.address =address;
        this.campusLocationId =campusLocationId;

    }

    public String getAddress() {
        return address;
    }

    public String getCampusLocationId() {
        return campusLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampusLocation that = (CampusLocation) o;
        return Objects.equals(address, that.address) &&
                campusLocationId.equals(that.campusLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campusLocationId);
    }
}
