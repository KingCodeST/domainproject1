package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import za.ac.cputassignment.domain.location.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class Ride {
    @Id
    private String Rideid;
        private String color;
      private  List<Location>  local=new ArrayList<Location>();
      private  List<Timetable> listTime=new ArrayList<Timetable>();



        private Ride(){}

        private Ride(Builder builder)
        {
            this.Rideid =builder.Rideid;
            this.color =builder.color;
        }

    public String getId() {
        return Rideid;
    }

    public String getColor() {
        return color;
    }

    public List<Location> getLocal() {
        return local;
    }

    public List<Timetable> getListTime() {
        return listTime;
    }

    public static class Builder
    {
        private String Rideid;
        private String color;
        private  List<Location>  local=new ArrayList<Location>();
        private  List<Timetable> listTime=new ArrayList<Timetable>();

        public Builder Rideid(String Rideid)
        {
            this.Rideid =Rideid;
            return this;
        }

        public  Builder color(String color)
        {
            this.color =color;
            return this;
        }

        public Ride build()
        {
            return new Ride(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ride ride = (Ride) o;
        return Rideid.equals(ride.Rideid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Rideid);
    }
}
