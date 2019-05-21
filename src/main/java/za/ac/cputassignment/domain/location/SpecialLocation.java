package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class SpecialLocation implements Location {
    @Id
    private SpecialLocation id;
    private int SLocalId;
    private String name;
    private String address;



    private SpecialLocation(){}


    public SpecialLocation(Builder builder)
    {
        this.id =builder.id;
        this.SLocalId =builder.SLocalId;
        this.name    =builder.name;
        this.address =builder.address;

    }

    public SpecialLocation getId() {
        return id;
    }

    public int getSLocalId() {
        return SLocalId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void LocationName() {

    }

    @Override
    public void numberStudents() {

    }

    @Override
    public void RideInfor() {

    }


    public static class Builder
    {
        private SpecialLocation id;
        private int SLocalId;
        private String name;
        private String address;

        public Builder id(SpecialLocation id)
        {
            this.id =id;
            return this;
        }

        public Builder SLocalId(int SLocalId)
        {
            this.SLocalId =SLocalId;
            return  this;
        }

        public  Builder name(String name)
        {
            this.name =name;
            return this;
        }

        public Builder address(String address)
        {
            this.address =address;
            return this;
        }

        public SpecialLocation build()
        {
            return  new SpecialLocation(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialLocation that = (SpecialLocation) o;
        return SLocalId == that.SLocalId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(SLocalId);
    }

    @Override
    public String toString() {
        return "SpecialLocation{" +
                "SLocalId=" + SLocalId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
