package za.ac.cputassignment.domain.person;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EntityScan
public class DriverBus {

        private String busDriverName,driverId;

        private DriverBus(){}

        public DriverBus(String busDriverName, String driverId) {
                busDriverName = busDriverName;
                driverId = driverId;
        }

        public String getBusDriverName() {
                return busDriverName;
        }

        public void setBusDriverName(String busDriverName) {
                busDriverName = busDriverName;
        }

        public String getDriverId() {
                return driverId;
        }

        public void setDriverId(String driverId) {
                driverId = driverId;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DriverBus driverBus = (DriverBus) o;
                return driverId.equals(driverBus.driverId);
        }

        @Override
        public int hashCode() {
                return Objects.hash(driverId);
        }
}
