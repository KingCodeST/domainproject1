package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Objects;

@EntityScan
public class ArletInfor {


    private String alertInforId;
    private String blue,red,green;
   // private Date simpledate;


    private ArletInfor(){}


    private ArletInfor(Builder builder)
    {

        this.blue =builder.blue;
        this.green =builder.green;
        this.red =builder.red;
     //   this.simpledate =builder.simpledate;
        this.alertInforId=builder.alertInforId;

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

//    public Date getSimpledate() {
//        return simpledate;
//    }

    public String getAlertInforId() {
        return alertInforId;
    }

    public static class Builder
    {

        private String alertInforId;
        private String blue,red,green;
      //  private Date simpledate;

        public Builder setAlertInforId(String alertInforId)
        {
            this.alertInforId =alertInforId;
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

//        public Builder simpledate(Date simpledate)
//        {
//            this.simpledate =simpledate;
//            return this;
//        }

        public Builder copy(ArletInfor arletInfor){
            this.alertInforId=arletInfor.alertInforId;
            this.blue =arletInfor.blue;
            this.green =arletInfor.green;
            this.red =arletInfor.red;
        //    this.simpledate =arletInfor.simpledate;
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
        //        ", simpledate='" + simpledate + '\'' +
                '}';
    }
}
