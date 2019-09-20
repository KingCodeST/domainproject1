package za.ac.cputassignment.domain.transport;

import java.util.Objects;

public class VanVehicle {

    private String vehicleVan;

    private VanVehicle(){}

    private VanVehicle(Builder builder){
        this.vehicleVan =builder.vehicleVan;
    }

    public String getVehicleVan() {
        return vehicleVan;
    }

    public static class Builder{
        private String vehicleVan;

        public Builder VehicleVan(String vehicleVan)
        {
            this.vehicleVan =vehicleVan;
            return this;
        }

        public Builder copy(VanVehicle vanVehicle)
        {
            this.vehicleVan =vanVehicle.vehicleVan;
            return this;
        }

        public VanVehicle build(){
            return new VanVehicle(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VanVehicle that = (VanVehicle) o;
        return vehicleVan.equals(that.vehicleVan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleVan);
    }

    @Override
    public String toString() {
        return "VanVehicle{" +
                "vehicleVan='" + vehicleVan + '\'' +
                '}';
    }
}
