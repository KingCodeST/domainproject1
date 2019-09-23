package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class BusInfor {


    private String vehicleBus;
    private String vehicleBusId;
    
    private BusInfor(){}
    
    private BusInfor(Builder builder){
        this.vehicleBus =builder.vehicleBus;
        this.vehicleBusId =builder.vehicleBusId;
    }

    public String getVihicleBus() {
        return vehicleBus;
    }



    public String getVehicleBusId() {
        return vehicleBusId;
    }

    public static class Builder{
        
        private String vehicleBus;
        private String vehicleBusId;
        
        public Builder VehicleBus(String vehicleBus){
            this.vehicleBus =vehicleBus;
            return this;
        }

        public Builder setVehicleBusId(String vehicleBusId)
        {
            this.vehicleBusId =vehicleBusId;
            return this;
        }
        
        public Builder copy(BusInfor busInfor){
            this.vehicleBus =busInfor.vehicleBus;
            this.vehicleBusId =busInfor.vehicleBusId;
            return this;
        }


        
        public BusInfor buid(){
            return new BusInfor(this);
        }
        
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusInfor busInfor = (BusInfor) o;
        return vehicleBus.equals(busInfor.vehicleBus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleBus);
    }

    @Override
    public String toString() {
        return "BusInfor{" +
                "vehicleBus='" + vehicleBus + '\'' +
                '}';
    }
}
