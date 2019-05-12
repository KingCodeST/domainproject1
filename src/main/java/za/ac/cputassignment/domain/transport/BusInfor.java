package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class BusInfor implements Vehicle{

    @Id
    private String id;
    private int yearsofservice;

    private BusInfor(){}

    private  BusInfor(Builder build)
    {
       // super();
        this.id =build.id;
        this.yearsofservice=build.yearsofservice;
    }

    public String getId() {
        return id;
    }

    public int getYearsofservice() {
        return yearsofservice;
    }

    public static class Builder
    {
        private String id;
        private int yearsofservice;

        public Builder id(String id)
        {
            this.id=id;
            return this;
        }

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

    @Override
    public void VehicleType() {

    }

    @Override
    public void LicenseDisk() {

    }

    @Override
    public void Service() {

    }
}
