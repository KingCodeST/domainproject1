package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class VanVehicle {

    @Id
    private String id;
    private String vehicleVan;


    public VanVehicle(String vehicleVan, String id) {
        this.vehicleVan = vehicleVan;
        this.id = id;
    }

    public VanVehicle(String vehicleVan) {
        this.vehicleVan = vehicleVan;
    }

    public String getId() {
        return id;
    }

    public String getVehicleVan() {
        return vehicleVan;
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
        return "VanVehicleFactory{" +
                "vehicleVan='" + vehicleVan + '\'' +
                '}';
    }
}
