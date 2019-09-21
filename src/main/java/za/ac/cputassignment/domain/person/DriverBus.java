package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class DriverBus {

        private String BusDriverName,DriverId;

        private DriverBus(){}

        public DriverBus(String busDriverName, String driverId) {
                BusDriverName = busDriverName;
                DriverId = driverId;
        }

        public String getBusDriverName() {
                return BusDriverName;
        }

        public void setBusDriverName(String busDriverName) {
                BusDriverName = busDriverName;
        }

        public String getDriverId() {
                return DriverId;
        }

        public void setDriverId(String driverId) {
                DriverId = driverId;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DriverBus driverBus = (DriverBus) o;
                return DriverId.equals(driverBus.DriverId);
        }

        @Override
        public int hashCode() {
                return Objects.hash(DriverId);
        }
}
