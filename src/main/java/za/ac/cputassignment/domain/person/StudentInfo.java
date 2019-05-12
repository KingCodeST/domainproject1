package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class StudentInfo  {

    @Id
    private String id;
    private String address;
    private int infid;


    private StudentInfo(){}

    private StudentInfo(Builder builder)
    {
        this.id =builder.id;
        this.infid =builder.infid;
        this.address =builder.address;

    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getInfid() {
        return infid;
    }

    public static class Builder{

        private String id;
        private String address;
        private int infid;

        public Builder id(String id)
        {
            this.id =id;
            return  this;
        }

        public  Builder infid(int infid)
        {
            this.infid =infid;
            return this;
        }

        public  Builder address(String address)
        {
            this.address =address;
            return  this;
        }

        public StudentInfo build()
        {
            return new StudentInfo(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentInfo that = (StudentInfo) o;
        return infid == that.infid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(infid);
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "address='" + address + '\'' +
                ", infid=" + infid +
                '}';
    }
}
