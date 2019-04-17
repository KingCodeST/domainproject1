package za.ac.cputassignment.domain.eventTriggs;

import za.ac.cputassignment.domain.location.Location;

import java.util.ArrayList;
import java.util.List;

public class Ride {

        private String color;
      private  List<Location>  local=new ArrayList<Location>();
      private  List<Timetable> listTime=new ArrayList<Timetable>();



        private Ride(){}

        private Ride(Builder builder)
        {
            this.color =builder.color;
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
        private String color;
        private  List<Location>  local=new ArrayList<Location>();
        private  List<Timetable> listTime=new ArrayList<Timetable>();

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
