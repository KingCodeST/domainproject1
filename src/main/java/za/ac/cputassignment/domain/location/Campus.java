package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;



@EntityScan
public class Campus {


    private String Id;
    private String campusname;

    private Campus (){}


    public Campus(Builder builder)
    {
        this.campusname =builder.campusname;
        this.Id =builder.Id;

    }

    public String getName() {
        return campusname;
    }

    public String getCampusId() {
        return Id;
    }

    public static class Builder
    {
        public String Id;

        private String campusname;


        public Builder Id(String Id)
        {
            this.Id =Id;
            return this;
        }

        public  Builder campusName(String campusname)
        {
            this.campusname =campusname;
            return this;
        }



        public  Campus build()
        {
            return new Campus(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campus campus = (Campus) o;
        return Id == campus.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusname='" + campusname + '\'' +
                ", campusId=" + Id +
                '}';
    }
}
