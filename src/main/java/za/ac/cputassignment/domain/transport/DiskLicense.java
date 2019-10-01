package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Objects;

@EntityScan
public class DiskLicense {

    private Date experationDate;
    private String code;



    private DiskLicense(){}

    public DiskLicense(Builder builder){
        this.experationDate = builder.experationDate;
        this.code = builder.code;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public String getCode() {
        return code;
    }

    public  static class Builder{

        private Date experationDate;
        private String code;

        public Builder experationDate(Date experationDate)
        {
            this.experationDate =experationDate;
            return this;
        }

        public Builder code(String code){
            this.code =code;
            return this;
        }

        public Builder copy(DiskLicense diskLicense)
        {
            this.code =diskLicense.code;
            this.experationDate=diskLicense.experationDate;
            return this;
        }

        public DiskLicense build()
        {
            return new DiskLicense(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiskLicense that = (DiskLicense) o;
        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }


    @Override
    public String toString() {
        return "DiskLicense{" +
                "experationDate='" + experationDate + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
