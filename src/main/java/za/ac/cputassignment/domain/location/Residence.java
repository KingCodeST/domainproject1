package za.ac.cputassignment.domain.location;



import java.util.Objects;

public class Residence  {


    private String residenceName;
    private int redisenceId;
    private String Address;

    private Residence (){}


    public Residence(Builder builder)
    {

        this.residenceName=builder.residenceName;
        this.redisenceId =builder.redisenceId;
        this.Address  =builder.address;


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




    public static class Builder
    {

        private int redisenceId;
        private String residenceName;
        private String address;


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
