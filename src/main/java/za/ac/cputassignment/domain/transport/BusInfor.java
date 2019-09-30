package za.ac.cputassignment.domain.transport;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class BusInfor {


    private String vehicleBus;
    private String vehicleBusId;

    public BusInfor(String vehicleBus, String vehicleBusId) {
        this.vehicleBus = vehicleBus;
        this.vehicleBusId = vehicleBusId;
    }

    public BusInfor(String busInfo) {
    }

    public String getVehicleBus() {
        return vehicleBus;
    }

    public String getVehicleBusId() {
        return vehicleBusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusInfor busInfor = (BusInfor) o;
        return vehicleBus.equals(busInfor.vehicleBus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleBus);
    }

    @Override
    public String toString() {
        return "BusInfor{" +
                "vehicleBus='" + vehicleBus + '\'' +
                '}';
    }
}
