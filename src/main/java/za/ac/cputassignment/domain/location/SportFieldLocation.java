package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class SportFieldLocation {

    private String address, sportFiledId;

    public SportFieldLocation(){}

    public SportFieldLocation(String address, String sportFiledId){
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
        SportFieldLocation that = (SportFieldLocation) o;
        return Objects.equals(address, that.address) &&
                sportFiledId.equals(that.sportFiledId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, sportFiledId);
    }

    @Override
    public String toString() {
        return "SportFieldLocation{" +
                "address='" + address + '\'' +
                ", sportFiledId='" + sportFiledId + '\'' +
                '}';
    }
}
