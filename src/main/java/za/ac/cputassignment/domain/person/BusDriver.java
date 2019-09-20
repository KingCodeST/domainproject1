package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan
public class BusDriver {


    private String driverID, driverName,driverLastName,licanseCode;
    private int age;


    private BusDriver(){}

    private BusDriver(Builder builder)
    {
        this.driverID =builder.driverID;
        this.age =builder.age;
        this.driverName =builder.driverName;
        this.driverLastName=builder.driverLastName;
        this.licanseCode =builder.licanseCode;
    }

    public String getDriverID()
    {
        return  driverID;
    }

    public String getDriverName()
    {
        return  driverName;
    }

    public String getLicanseCode()
    {
        return  licanseCode;
    }
    public int getAge()
    {
        return  age;
    }



    public static class Builder{

        private String driverID, driverName,driverLastName,licanseCode;
        private int age;

        public Builder driverID(String driverID)
        {
            this.driverID =driverID;
            return this;
        }

        public Builder driverName(String driverName)
        {
            this.driverName =driverName;
            return this;
        }

        public Builder driverLastName(String driverLastName)
        {
            this.driverLastName=driverLastName;
            return this;
        }

        public Builder licanseCode(String licanseCode)
        {
            this.licanseCode =licanseCode;
            return this;
        }

        public Builder age(int age)
        {
            this.age =age;
            return this;
        }

        public Builder copy(BusDriver busDriver){
            this.age =busDriver.age;
            this.driverID =busDriver.driverID;
            this.driverName =busDriver.driverName;
            this.driverLastName =busDriver.driverLastName;
            this.licanseCode =busDriver.licanseCode;

            return this;
        }


        public BusDriver build()
        {
            return new BusDriver();
        }


    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverID='" + driverID + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", licanseCode='" + licanseCode + '\'' +
                ", age=" + age +
                '}';
    }
}
