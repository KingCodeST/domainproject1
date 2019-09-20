package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class BusInfor {


    private String vehicleBus;
    
    private BusInfor(){}
    
    private BusInfor(Builder builder){
        this.vehicleBus =builder.vehicleBus;
    }

    public String getVihicleBus() {
        return vehicleBus;
    }
    
    private static class Builder{
        
        private String vehicleBus;
        
        public Builder VehicleBus(String vehicleBus){
            this.vehicleBus =vehicleBus;
            return this;
        }
        
        public Builder copy(BusInfor busInfor){
            this.vehicleBus =busInfor.vehicleBus;
            return this;
        }
        
        private BusInfor buid(){
            return new BusInfor(this);
        }
        
        
    }
    
}
