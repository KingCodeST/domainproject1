package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;



@EntityScan
public class Campus {

    @Id
    private String id;
    private String campusname;

    private Campus (){}


    public Campus(Builder builder)
    {
        this.campusname =builder.campusname;
        this.id =builder.id;

    }

    public String getName() {
        return campusname;
    }

    public String getCampusId() {
        return id;
    }

    public static class Builder
    {
        public String id;

        private String campusname;


        public Builder id(String Id)
        {
            this.id =Id;
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
        return id == campus.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusname='" + campusname + '\'' +
                ", campusId=" + id +
                '}';
    }
}
