package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import za.ac.cputassignment.domain.location.Location;

import java.util.ArrayList;
import java.util.List;

@EntityScan
public class Ride {
    @Id
    private String id;
        private String color;
      private  List<Location>  local=new ArrayList<Location>();
      private  List<Timetable> listTime=new ArrayList<Timetable>();



        private Ride(){}

        private Ride(Builder builder)
        {
            this.id =builder.id;
            this.color =builder.color;
        }

    public String getId() {
        return id;
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
        private String id;
        private String color;
        private  List<Location>  local=new ArrayList<Location>();
        private  List<Timetable> listTime=new ArrayList<Timetable>();

        public Builder id(String id)
        {
            this.id =id;
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


}
