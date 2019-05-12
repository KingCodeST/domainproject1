package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class DriverInfor   {

    @Id
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

    public static class Builder{

        private String id;

        public Builder id(String id)
        {
            this.id =id;
            return this;
        }


        public DriverInfor build()
        {
            return new DriverInfor(this);
        }

    }

    @org.jetbrains.annotations.Contract(value = "null -> false", pure = true)
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
