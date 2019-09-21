package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan
public class Driver {


    private String driverID, driverName,driverLastName,licanseCode;
    private int age;


    private Driver(){}

    private Driver(Builder builder)
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

        public Builder copy(Driver driver){
            this.age = driver.age;
            this.driverID = driver.driverID;
            this.driverName = driver.driverName;
            this.driverLastName = driver.driverLastName;
            this.licanseCode = driver.licanseCode;

            return this;
        }


        public Driver build()
        {
            return new Driver();
        }


    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID='" + driverID + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", licanseCode='" + licanseCode + '\'' +
                ", age=" + age +
                '}';
    }
}
