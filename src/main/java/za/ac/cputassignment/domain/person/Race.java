package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;

@EntityScan
public class Race {

    @Id
    private String raceGroup, id;

    private Race(){}

    private Race (Builder builder){
        this.raceGroup =builder.raceGroup;
        this.id =builder.id;
    }

    public String getRaceGroup() {
        return raceGroup;
    }

    public String getId() {
        return id;
    }

    public static class Builder{
        private String raceGroup,id;


        public Builder raceGroup(String raceGroup){
            this.raceGroup =raceGroup;

            return this;
        }

        public Builder setid(String id)
        {
            this.id =id;
            return this;
        }

        public Builder copy(Race race){
            this.raceGroup =race.raceGroup;
            this.id =race.id;
            return this;
        }

        public Race build(){
            return new Race(this);
        }

    }

}
