package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Objects;

@EntityScan
public class SpecialLocation  {


    private int SLocalId;
    private String name;
    private String address;



    private SpecialLocation(){}


    public SpecialLocation(Builder builder)
    {

        this.SLocalId =builder.SLocalId;
        this.name    =builder.name;
        this.address =builder.address;

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



    public static class Builder
    {
        private String id;
        private int SLocalId;
        private String name;
        private String address;

        public Builder id(String id)
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

        public Builder copy(SpecialLocation specialLocation)
        {
           this.SLocalId =specialLocation.SLocalId;
           this.address =specialLocation.address;
           this.name =specialLocation.name;

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
