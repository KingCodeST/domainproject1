package za.ac.cputassignment.domain.location;

public class Residence {

    private String residenceName;
    private int redisenceId;

    private Residence (){}


    public Residence(Builder builder)
    {
        this.residenceName=builder.residenceName;
        this.redisenceId =builder.redisenceId;

    }

    public String getresidenceName() {
        return residenceName;
    }

    public int getResidenceId() {
        return redisenceId;
    }

    public static class Builder
    {
        private int redisenceId;
        private String residenceName;


        public Builder residenceId(int residenceId)
        {
            this.redisenceId =redisenceId;
            return this;
        }

        public  Builder residenceName(String residenceName)
        {
            this.residenceName =residenceName;
            return this;
        }



        public  Residence build()
        {
            return new Residence(this);
        }

    }

}
