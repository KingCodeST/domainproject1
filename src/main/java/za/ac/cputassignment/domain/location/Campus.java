package za.ac.cputassignment.domain.location;

import java.util.Objects;

public class Campus {

    private String campusname;
    private int campusId;

    private Campus (){}


    public Campus(Builder builder)
    {
        this.campusname =builder.campusname;
        this.campusId =builder.campusId;

    }

    public String getName() {
        return campusname;
    }

    public int getCampusId() {
        return campusId;
    }

    public static class Builder
    {
        private int campusId;
        private String campusname;


        public Builder campusId(int campusId)
        {
            this.campusId =campusId;
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
        return campusId == campus.campusId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(campusId);
    }

    @Override
    public String toString() {
        return "Campus{" +
                "campusname='" + campusname + '\'' +
                ", campusId=" + campusId +
                '}';
    }
}
