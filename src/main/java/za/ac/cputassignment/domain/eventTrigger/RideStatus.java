package za.ac.cputassignment.domain.eventTrigger;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Objects;

@EntityScan
public class RideStatus  {





    private RideStatus (){}

    private RideStatus (Builder builder)
    {


    }



    public static class Builder{
        private String id;

        public Builder id(String id)
        {
            this.id =id;
            return this;
        }

        public RideStatus build()
        {
            return new RideStatus(this);
        }

    }




}
