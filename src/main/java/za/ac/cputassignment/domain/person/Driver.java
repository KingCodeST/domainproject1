package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;


@EntityScan
public class Driver {


    private String driverID, driverName,driverLastName,licanseCode;
    private int age;
    private String gender;
    private String race;


    private Driver(){}

    private Driver(Builder builder)
    {
        this.driverID =builder.driverID;
        this.age =builder.age;
        this.driverName =builder.driverName;
        this.driverLastName=builder.driverLastName;
        this.licanseCode =builder.licanseCode;
        this.gender =builder.gender;
        this.race =builder.race;
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

    public String getDriverLastName() {
        return driverLastName;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public static class Builder{

        private String driverID, driverName,driverLastName,licanseCode,gender,race;
        private int age;


        public Builder driverID(String driverID)
        {
            this.driverID =driverID;
            return this;
        }

        public Builder setGender(String gender)
        {
            this.gender=gender;
            return this;
        }

        public Builder setRace(String race)
        {
            this.race =race;
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
            this.race =driver.race;
            this.gender =driver.gender;

            return this;
        }


        public Driver build()
        {
            return new Driver();
        }


    }

    @Override
    public String toString() {
        return "DriverFactory{" +
                "driverID='" + driverID + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", licanseCode='" + licanseCode + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age &&
                driverID.equals(driver.driverID) &&
                Objects.equals(driverName, driver.driverName) &&
                Objects.equals(driverLastName, driver.driverLastName) &&
                Objects.equals(licanseCode, driver.licanseCode) &&
                Objects.equals(gender, driver.gender) &&
                Objects.equals(race, driver.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverID);
    }
}
