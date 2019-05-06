package za.ac.cputassignment.domain.eventTrigger;

import java.util.Date;
import java.util.Objects;


public class ArletInfor {

    private int id;

    public ArletInfor(String bluee, String bluer, String greye, String er) {
    }

    public int getId() {
        return id;
    }

    private String blue,red,greed;
    private String simpledate;

    public String getBlue() {
        return blue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRed() {
        return red;
    }

    public String getGreed() {
        return greed;
    }

    public String getSimpledate() {
        return simpledate;


    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public void setGreed(String greed) {
        this.greed = greed;
    }

    public void setSimpledate(String simpledate) {
        this.simpledate = simpledate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArletInfor that = (ArletInfor) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
