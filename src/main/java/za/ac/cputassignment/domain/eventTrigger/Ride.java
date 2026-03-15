package za.ac.cputassignment.domain.eventTrigger;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "rides", uniqueConstraints = {
        @UniqueConstraint(columnNames = "rideNumber")
})
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "Ride number is required")
    private String rideNumber;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Trip name is required")
    @Size(min = 3, max = 100, message = "Trip name must be 3-100 characters")
    private String nameTrip;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    private Ride(){}

    private Ride(Builder builder){
        this.rideNumber =builder.rideNumber;
        this.nameTrip =builder.nameTrip;
    }


    public String getRideNumber() {
        return rideNumber;
    }

    public String getNameTrip() {
        return nameTrip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder{

        private String rideNumber;
        private String nameTrip;

        public Builder rideNumber(String rideNumber){
            this.rideNumber = rideNumber;
            return this;
        }

        public Builder nameTrip(String nameTrip) {
            this.nameTrip = nameTrip;
            return this;
        }

        public Builder copy(Ride ride){
            this.rideNumber = ride.rideNumber;
            this.nameTrip = ride.nameTrip;
            return this;
        }

        public Ride build(){
            return new Ride(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ride ride = (Ride) o;
        return rideNumber.equals(ride.rideNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rideNumber);
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id='" + id + '\'' +
                ", rideNumber='" + rideNumber + '\'' +
                ", nameTrip='" + nameTrip + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

}