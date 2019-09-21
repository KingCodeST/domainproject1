package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class SportFiledLocation {

    private String address, sportFiledId;

    private SportFiledLocation(){}

    public SportFiledLocation(String address,String sportFiledId){
        this.address =address;
        this.sportFiledId =sportFiledId;
    }

    public String getAddress() {
        return address;
    }

    public String getSportFiledId() {
        return sportFiledId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportFiledLocation that = (SportFiledLocation) o;
        return Objects.equals(address, that.address) &&
                sportFiledId.equals(that.sportFiledId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, sportFiledId);
    }

    @Override
    public String toString() {
        return "SportFiledLocation{" +
                "address='" + address + '\'' +
                ", sportFiledId='" + sportFiledId + '\'' +
                '}';
    }
}
