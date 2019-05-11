package za.ac.cputassignment.domain.eventTrigger;

import za.ac.cputassignment.domain.location.Location;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.Date;
import java.util.Objects;

public class TimetableInfo {

    private String id;
    private Date simple;
    private Location location;
    private Vehicle vehicle;
    private int timetableid;


    private TimetableInfo(){}

    private TimetableInfo(Builder builder)
    {
        this.timetableid =builder.timetableid;
    }

    public Date getSimple() {
        return simple;
    }

    public int getTimetableid() {
        return timetableid;
    }

    public String getId() {
        return id;
    }

    public static class Builder{
        private  String id;
        private Date simple;
        private Location location;
        private Vehicle vehicle;
        private int timetableid;

        public  Builder Id(String id)
        {
            this.id = id;
            return this;
        }

        public TimetableInfo build()
        {
            return new TimetableInfo(this);
        }



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimetableInfo that = (TimetableInfo) o;
        return timetableid == that.timetableid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timetableid);
    }

    @Override
    public String toString() {
        return "TimetableInfo{" +
                "simple=" + simple +
                ", timetableid=" + timetableid +
                '}';
    }
}
