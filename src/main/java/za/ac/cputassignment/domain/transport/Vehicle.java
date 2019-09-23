package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Vehicle {

    private String typeVehicle,disklicense,capacity,vehicleId;


    private Vehicle(){}

    private Vehicle(Builder builder){
        this.typeVehicle =builder.typeVehicle;
       this.disklicense=builder.disklicense;
       this.capacity=builder.capacity;
       this.vehicleId =builder.vehicleId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public String getDisklicense() {
        return disklicense;
    }

    public String getCapacity() {
        return capacity;
    }

    public static class Builder{
        private String typeVehicle,disklicense,capacity,vehicleId;

        public Builder setTypeVehicle(String typeVehicle)
        {
            this.typeVehicle =typeVehicle;
            return this;
        }

        public Builder setVicleId(String vehicleId)
        {
            this.vehicleId =vehicleId;
            return this;
        }

        public Builder setDisklicense(String disklicense)
        {
            this.disklicense =disklicense;
            return this;
        }

        public Builder setCapacity(String capacity)
        {
            this.capacity =capacity;
            return this;
        }

        public Builder copy(Vehicle vehicle)
        {
            this.capacity =vehicle.capacity;
            this.disklicense =vehicle.disklicense;
            this.typeVehicle=vehicle.typeVehicle;
            this.vehicleId=vehicle.vehicleId;
            return this;
        }

        public Vehicle build()
        {
            return new Vehicle(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(typeVehicle, vehicle.typeVehicle) &&
                Objects.equals(disklicense, vehicle.disklicense) &&
                Objects.equals(capacity, vehicle.capacity) &&
                vehicleId.equals(vehicle.vehicleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId);
    }
}
