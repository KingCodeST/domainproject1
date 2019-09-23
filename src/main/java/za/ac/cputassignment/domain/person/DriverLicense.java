package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.text.DateFormat;
import java.util.Date;

@EntityScan
public class DriverLicense {
    
    private String code;
    private Date expirationDate;
    
    private DriverLicense(){}
    
    private DriverLicense(Builder builder)
    {
        this.code=builder.code;
        this.expirationDate =builder.expirationDate;
    }

    public String getCode() {
        return code;
    }

    public Date getExperationDate() {
        return expirationDate;
    }
    
    public static class Builder{
        private String code;
        private Date expirationDate;
        
        public Builder setCode(String code)
        {
            this.code =code;
            return this;
        }
        
        public Builder setExpiration(Date expiration)
        {
            this.expirationDate =expiration;
            return this;
        }

        public Builder copy(DriverLicense driverLicense)
        {
            this.code =driverLicense.code;
            this.expirationDate=driverLicense.expirationDate;
            return this;
        }

        public DriverLicense build()
        {
            return new DriverLicense(this);
        }

    }
    
    
}
