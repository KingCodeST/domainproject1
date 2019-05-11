package za.ac.cputassignment.domain.eventTrigger;

import java.util.Date;
import java.util.Objects;


public class ArletInfor {

    private String id;

    private String blue,red,green;
    private String simpledate;


    private ArletInfor(){}


    private ArletInfor(Builder builder)
    {
        this.id =builder.id;
        this.blue =builder.blue;
        this.green =builder.green;
        this.red =builder.red;
        this.simpledate =builder.simpledate;

    }


    public String getId() {
        return id;
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
        private String id;

        private String blue,red,green;
        private String simpledate;

        public Builder id(String id)
        {
            this.id =id;
            return this;
        }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArletInfor that = (ArletInfor) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ArletInfor{" +
                "id='" + id + '\'' +
                ", blue='" + blue + '\'' +
                ", red='" + red + '\'' +
                ", green='" + green + '\'' +
                ", simpledate='" + simpledate + '\'' +
                '}';
    }
}
