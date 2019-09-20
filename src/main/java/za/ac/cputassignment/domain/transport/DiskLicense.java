package za.ac.cputassignment.domain.transport;

import java.util.Objects;

public class DiskLicense {

    private String experationDate;
    private String code;



    private DiskLicense(){}

    public DiskLicense(Builder builder){
        this.experationDate = builder.experationDate;
        this.code = builder.code;
    }

    public String getExperationDate() {
        return experationDate;
    }

    public String getCode() {
        return code;
    }

    public  static class Builder{

        private String experationDate;
        private String code;

        public Builder experationDate(String experationDate)
        {
            this.experationDate =experationDate;
            return this;
        }

        public Builder code(String code){
            this.code =code;
            return this;
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
