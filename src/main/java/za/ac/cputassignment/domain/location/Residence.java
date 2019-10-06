package za.ac.cputassignment.domain.location;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class Residence  {

    @Id
    private String id;
    private String residenceName;
    private String Address;
    private String residenceId;

    private Residence (){}


    public Residence(Builder builder)
    {
        this.residenceName=builder.residenceName;
        this.Address  =builder.address;
        this.residenceId=builder.redisenceId;

    }



    public String getresidenceName() {
        return residenceName;
    }

    public String getAddress() {
        return Address;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public String getResidenceID() {
        return residenceId;
    }

    public static class Builder
    {

        private String redisenceId;
        private String residenceName;
        private String address;


        public Builder residenceId(String residenceId)
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

        public Builder copy(Residence residence){
            this.address =address;
            this.redisenceId =redisenceId;
            this.residenceName =residenceName;

            return this;
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
        return Objects.equals(residenceName, residence.residenceName) &&
                Objects.equals(Address, residence.Address) &&
                residenceId.equals(residence.residenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residenceId);
    }
}
