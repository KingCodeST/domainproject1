package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;



@EntityScan
public class Campus {

    @Id
    private String campusid;
    private String campusname;

    private Campus (){}


    public Campus(Builder builder)
    {
        this.campusname =builder.campusname;
        this.campusid =builder.campusid;

    }

    public String getName() {
        return campusname;
    }

    public String getCampusId() {
        return campusid;
    }

    public static class Builder
    {
        public String campusid;

        private String campusname;


        public Builder campusid(String campusid)
        {
            this.campusid =campusid;
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
        return campusid == campus.campusid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campusid);
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusname='" + campusname + '\'' +
                ", campusId=" + campusid +
                '}';
    }
}
