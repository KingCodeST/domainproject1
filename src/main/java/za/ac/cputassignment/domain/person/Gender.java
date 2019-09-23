package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Gender {

    private String genderId, genderGroup;

    private Gender(){}

    private Gender(Builder builder){
        this.genderId =builder.genderId;
        this.genderGroup=builder.genderGroup;

    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderGroup() {
        return genderGroup;
    }

    public static class Builder{
        private String genderId,genderGroup;

        public Builder setGenderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public Builder setGenderGroup(String genderGroup){
            this.genderGroup =genderGroup;
            return this;
        }

        public Builder copy(Gender gender){
            this.genderId =gender.genderId;
            this.genderGroup=gender.genderGroup;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return genderId.equals(gender.genderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId);
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderGroup='" + genderGroup + '\'' +
                '}';
    }
}
