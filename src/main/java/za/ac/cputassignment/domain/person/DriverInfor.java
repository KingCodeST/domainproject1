package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class DriverInfor   {

    private String id;

    List<BusDriver>    busDriverList= new ArrayList<BusDriver>();

    private DriverInfor (){}

    private DriverInfor(Builder builder)
    {
        this.id =builder.id;
    }

    public String getId() {
        return id;
    }

    private static class Builder{

        private String id;

        private Builder id(String id)
        {
            this.id =id;
            return this;
        }


        private DriverInfor build()
        {
            return new DriverInfor(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverInfor that = (DriverInfor) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DriverInfor{" +
                "id='" + id + '\'' +
                ", busDriverList=" + busDriverList +
                '}';
    }
}
