package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import java.util.Objects;

@EntityScan
public class Van  {

    @Id
    private String id;
    private String numPlate;
    private String brand;
    private double patrol;
    private String vanId;


    private Van(Builder builder)
    {
        this.numPlate =builder.numPlate;
        this.brand  =builder.brand;
        this.patrol =builder.patrol;
        this.vanId =builder.vanId;


    }

    private Van() {}

    public String getVanId()
    {
        return  vanId;
    }

    public String getNumPlate() {
        return numPlate;
    }

    public String getBrand() {
        return brand;
    }

    public double getPatrol() {
        return patrol;
    }


    public static class Builder{

        private String numPlate;
        private String brand;
        private double patrol;
        private String vanId;

        public Builder numPlate(String numPlate)
        {
            this.numPlate =numPlate;
            return this;
        }

        public Builder brand(String brand)
        {
            this.brand =brand;
            return this;
        }

        public Builder patrol(double patrol)
        {
            this.patrol =patrol;
            return  this;
        }


        public Builder vanId(String vanId)
        {
            this.vanId =vanId;
            return this;
        }

        public Builder copy(Van van){
            this.brand =van.brand;
            this.numPlate= van.numPlate;
            this.patrol =van.patrol;
            this.vanId =van.vanId;

            return this;
        }

        public Van build()
        {
            return new Van();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Van van = (Van) o;
        return vanId == van.vanId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vanId);
    }

    @Override
    public String toString() {
        return "Van{" +
                "numPlate='" + numPlate + '\'' +
                ", brand='" + brand + '\'' +
                ", patrol=" + patrol +
                ", vanId=" + vanId +
                '}';
    }
}
