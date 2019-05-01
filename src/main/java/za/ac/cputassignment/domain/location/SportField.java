package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class SportField implements Location {

    private int sFieldID;
    private String fname;
    private String address;


    private SportField(){}


    public SportField(Builder builder)
    {
        this.sFieldID =builder.sFieldID;
        this.fname =builder.fname;
        this.address =builder.address;
    }

    public int getsFieldID() {
        return sFieldID;
    }

    public String getFname() {
        return fname;
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

    public static class Builder{

        private int sFieldID;
        private String fname;
        private String address;

        public Builder sFieldID(int sFieldID)
        {
            this.sFieldID =sFieldID;
            return  this;
        }

        public  Builder fname(String fname)
        {
            this.fname =fname;
            return  this;
        }

        public  Builder address(String address)
        {
            this.address =address;
            return  this;
        }

        public SportField build()
        {
            return  new SportField(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportField that = (SportField) o;
        return sFieldID == that.sFieldID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sFieldID);
    }

    @Override
    public String toString() {
        return "SportField{" +
                "sFieldID=" + sFieldID +
                ", fname='" + fname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
