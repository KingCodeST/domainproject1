package za.ac.cputassignment.domain.location;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@EntityScan
public class LocationInfor {
        @Id
        private String id;


        private LocationInfor(){}


        private LocationInfor(Builder build)
        {
            this.id =build.id;

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

            public LocationInfor build()
            {
                return new LocationInfor(this);
            }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return id.equals(builder.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    @Override
    public String toString() {
        return "LocationInfor{" +
                "id='" + id + '\'' +
                '}';
    }
}
