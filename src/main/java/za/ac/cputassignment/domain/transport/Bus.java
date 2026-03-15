package za.ac.cputassignment.domain.transport;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "buses", uniqueConstraints = {
        @UniqueConstraint(columnNames = "busId"),
        @UniqueConstraint(columnNames = "engineNumber")
})
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Brand name is required")
    private String brandName;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Model number is required")
    private String modelNo;

    @Column(nullable = false)
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @Column(length = 20)
    private String roadWorthy;

    @Column(nullable = false, unique = true)
    @Min(value = 1000, message = "Engine number must be valid")
    private int engineNumber;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "Bus ID is required")
    private String busId;

    private Bus() {
    }

    private Bus(Builder builder) {
        this.brandName = builder.brandName;
        this.engineNumber = builder.engineNumber;
        this.modelNo = builder.modelNo;
        this.quantity = builder.quantity;
        this.roadWorthy = builder.roadWorthy;
        this.busId = builder.busId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public String getModelNo() {
        return modelNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBusId() {
        return busId;
    }

    public String getRoadWorthy() {
        return roadWorthy;
    }

    public static class Builder {

        private String brandName;
        private int engineNumber;
        private String modelNo;
        private int quantity;
        private String roadWorthy;
        private String busId;

        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Builder busId(String busId) {
            this.busId = busId;
            return this;
        }

        public Builder engineNumber(int engineNumber) {
            this.engineNumber = engineNumber;
            return this;
        }

        public Builder modelNo(String modelNo) {
            this.modelNo = modelNo;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder roadWorthy(String roadWorthy) {
            this.roadWorthy = roadWorthy;
            return this;
        }

        public Builder copy(Bus bus) {
            this.brandName = bus.brandName;
            this.engineNumber = bus.engineNumber;
            this.modelNo = bus.modelNo;
            this.quantity = bus.quantity;
            this.roadWorthy = bus.roadWorthy;
            this.busId = bus.busId;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return busId.equals(bus.busId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", quantity=" + quantity +
                ", roadWorthy='" + roadWorthy + '\'' +
                ", engineNumber=" + engineNumber +
                ", busId='" + busId + '\'' +
                '}';
    }
}
