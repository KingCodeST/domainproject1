package za.ac.cputassignment.domain.eventTrigger;

import java.util.Date;
import java.util.Objects;


public class ArletInfor {



    private String blue,red,green;
    private String simpledate;


    private ArletInfor(){}


    private ArletInfor(Builder builder)
    {

        this.blue =builder.blue;
        this.green =builder.green;
        this.red =builder.red;
        this.simpledate =builder.simpledate;

    }




    public String getBlue() {
        return blue;
    }

    public String getRed() {
        return red;
    }

    public String getGreen() {
        return green;
    }

    public String getSimpledate() {
        return simpledate;
    }

    public static class Builder
    {


        private String blue,red,green;
        private String simpledate;


        public Builder blue(String blue)
        {
            this.blue =blue;
            return this;
        }

        public Builder red(String red)
        {
            this.red =red;
            return this;
        }

        public Builder green(String green)
        {
            this.green =green;
            return this;
        }

        public Builder simpledate(String simpledate)
        {
            this.simpledate =simpledate;
            return this;
        }

        public ArletInfor build()
        {
            return  new ArletInfor(this);
        }


    }


    @Override
    public String toString() {
        return "ArletInfor{" +

                ", blue='" + blue + '\'' +
                ", red='" + red + '\'' +
                ", green='" + green + '\'' +
                ", simpledate='" + simpledate + '\'' +
                '}';
    }
}
