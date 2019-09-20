package za.ac.cputassignment.domain.transport;

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

}
