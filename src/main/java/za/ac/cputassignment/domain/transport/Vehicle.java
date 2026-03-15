package za.ac.cputassignment.domain.transport;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "vehicles", uniqueConstraints = {
        @UniqueConstraint(columnNames = "vehicleId")
})
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Vehicle type is required")
    private String typeVehicle;

    @Column(nullable = false, length = 30)
    @NotBlank(message = "Disk license is required")
    private String diskLicense;

    @Column(nullable = false)
    @Min(value = 1, message = "Capacity must be at least 1")
    @Max(value = 200, message = "Capacity cannot exceed 200")
    private int capacity;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "Vehicle ID is required")
    private String vehicleId;


    private Vehicle(){}

    private Vehicle(Builder builder){
        this.typeVehicle = builder.typeVehicle;
        this.diskLicense = builder.diskLicense;
        this.capacity = builder.capacity;
        this.vehicleId = builder.vehicleId;
    }

    private Vehicle() {}

    public String getVehicleId() {
        return vehicleId;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public String getDiskLicense() {
        return diskLicense;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Builder{
        private String typeVehicle;
        private String diskLicense;
        private int capacity;
        private String vehicleId;

        public Builder typeVehicle(String typeVehicle) {
            this.typeVehicle = typeVehicle;
            return this;
        }

        public Builder vehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder diskLicense(String diskLicense) {
            this.diskLicense = diskLicense;
            return this;
        }

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder copy(Vehicle vehicle) {
            this.capacity = vehicle.capacity;
            this.diskLicense = vehicle.diskLicense;
            this.typeVehicle = vehicle.typeVehicle;
            this.vehicleId = vehicle.vehicleId;
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
        return vehicleId.equals(vehicle.vehicleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", typeVehicle='" + typeVehicle + '\'' +
                ", diskLicense='" + diskLicense + '\'' +
                ", capacity=" + capacity +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }
}
