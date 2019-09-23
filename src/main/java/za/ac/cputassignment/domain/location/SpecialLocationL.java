package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class SpecialLocationL {

    private String address, specialLId;

    public SpecialLocationL(){}

    public SpecialLocationL(String address,String specialLId){
        this.address =address;
        this.specialLId =specialLId;
    }

    public String getAddress() {
        return address;
    }

    public String getSpecialLId() {
        return specialLId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialLocationL that = (SpecialLocationL) o;
        return Objects.equals(address, that.address) &&
                specialLId.equals(that.specialLId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialLId);
    }
}
