package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class Bus implements  Vehicle{

    @Id
    private String Id;
    private String brandName;
    private String modelNo;
    private int quantity;
    private String roadWorthy;
    private int engineNumber;

    private Bus(){}


    private Bus(Builder builder)
    {
        this.Id =builder.Id;
        this.brandName =builder.brandName;
        this.engineNumber =builder.engineNumber;
        this.modelNo = builder.modelNo;
        this.quantity =builder.quantity;
        this.roadWorthy =builder.roadWorthy;
    }


    public String getId() {
        return Id;
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

    public String getRoadWorthy() {
        return roadWorthy;
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

    public static class Builder{

        private String Id;
        private String brandName;
        private int engineNumber;
        private String modelNo;
        private int quantity;
        private String roadWorthy;

        public Builder Id(String Id)
        {
            this.Id =Id;
            return  this;
        }

        public Builder brandName(String brandName)
        {
            this.brandName =brandName;
            return  this;
        }

        public Builder engineNumber(int engineNumber)
        {
            this.engineNumber =engineNumber;
            return  this;
        }

        public Builder modelNo(String modelNo)
        {
            this.modelNo =modelNo;
            return  this;
        }

        public Builder quantity(int quantity)
        {
            this.quantity =quantity;
            return  this;
        }

        public Builder roadWorty(String roadWorthy)
        {
            this.roadWorthy =roadWorthy;
            return  this;
        }

        public Bus build()
        {
            return new Bus(this);
        }


    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId='" + Id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", quantity=" + quantity +
                ", roadWorthy='" + roadWorthy + '\'' +
                ", engineNumber=" + engineNumber +
                '}';
    }
}
