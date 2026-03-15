package za.ac.cputassignment.domain.person;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "drivers", uniqueConstraints = {
        @UniqueConstraint(columnNames = "driverID"),
        @UniqueConstraint(columnNames = "licenseCode")
})
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "Driver ID is required")
    private String driverID;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Driver first name is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String driverName;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Driver last name is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String driverLastName;

    @Column(nullable = false, unique = true, length = 20)
    @NotBlank(message = "License code is required")
    private String licenseCode;

    @Column(nullable = false)
    @Min(value = 18, message = "Driver must be at least 18")
    @Max(value = 75, message = "Driver must be 75 or younger")
    private int age;

    @Column(length = 20)
    private String gender;

    @Column(length = 20)
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

    public String getLicenseCode()
    {
        return  licenseCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

        public Builder licenseCode(String licenseCode)
        {
            this.licenseCode = licenseCode;
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
            this.licenseCode = driver.licenseCode;
            this.race =driver.race;
            this.gender =driver.gender;

            return this;
        }


        public Driver build()
        {
            return new Driver(this);
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
