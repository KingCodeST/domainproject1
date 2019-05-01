package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cputassignment.domain.login.User;
@EntityScan
public class BusDriver implements User {

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

    @Override
    public void profile() {
        
    }

    @Override
    public void editProfile() {

    }

    @Override
    public void userName() {

    }

    @Override
    public void passWord() {

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
