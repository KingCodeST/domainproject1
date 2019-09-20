package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class BusInfor {


    private int yearsofservice;

    private BusInfor(){}

    private  BusInfor(Builder build)
    {
       // super();

        this.yearsofservice=build.yearsofservice;
    }



    public int getYearsofservice() {
        return yearsofservice;
    }

    public static class Builder
    {

        private int yearsofservice;



        public Builder yearsofservice(int yearsofservice)
        {
            this.yearsofservice =yearsofservice;
            return this;
        }


        public BusInfor buid()
        {
            return new BusInfor(this);
        }

    }


}
