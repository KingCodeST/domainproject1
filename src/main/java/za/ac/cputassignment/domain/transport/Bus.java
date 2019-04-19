package za.ac.cputassignment.domain.transport;

public class Bus implements  Vehicle{

    private String busId;
    private String brandName;
    private String modelNo;
    private int quantity;
    private String roadWorthy;
    private int engineNumber;

    private Bus(){}


    private Bus(Builder builder)
    {
        this.busId =builder.busId;
        this.brandName =builder.brandName;
        this.engineNumber =builder.engineNumber;
        this.modelNo = builder.modelNo;
        this.quantity =builder.quantity;
        this.roadWorthy =builder.roadWorthy;
    }


    public String getBusId() {
        return busId;
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

        private String busId;
        private String brandName;
        private int engineNumber;
        private String modelNo;
        private int quantity;
        private String roadWorthy;

        public Builder busId(String busId)
        {
            this.busId =busId;
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
                "busId='" + busId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", quantity=" + quantity +
                ", roadWorthy='" + roadWorthy + '\'' +
                ", engineNumber=" + engineNumber +
                '}';
    }
}
