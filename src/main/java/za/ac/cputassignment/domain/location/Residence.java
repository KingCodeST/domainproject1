package za.ac.cputassignment.domain.location;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Residence implements Location {
    @Id
    private String id;
    private String residenceName;
    private int redisenceId;
    private String Address;

    private Residence (){}


    public Residence(Builder builder)
    {
        this.id =builder.id;
        this.residenceName=builder.residenceName;
        this.redisenceId =builder.redisenceId;
        this.Address  =builder.address;


    }

    public String getId() {
        return id;
    }

    public String getresidenceName() {
        return residenceName;
    }

    public int getResidenceId() {
        return redisenceId;
    }

    public String getAddress() {
        return Address;
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
        private String id;
        private int redisenceId;
        private String residenceName;
        private String address;

        public Builder id(String id)
        {
            this.id =id;
            return this;
        }

        public Builder residenceId(int residenceId)
        {
            this.redisenceId =redisenceId;
            return this;
        }

        public  Builder residenceName(String residenceName)
        {
            this.residenceName =residenceName;
            return this;
        }

        public  Builder address(String address)
        {
            this.address =address;
            return  this;
        }



        public  Residence build()
        {
            return new Residence(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residence residence = (Residence) o;
        return redisenceId == residence.redisenceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisenceId);
    }

    @Override
    public String toString() {
        return "Residence{" +
                "residenceName='" + residenceName + '\'' +
                ", redisenceId=" + redisenceId +
                ", Address='" + Address + '\'' +
                '}';
    }
}
