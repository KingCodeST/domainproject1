package za.ac.cputassignment.service.service.TransportService;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface BusInforService extends IService<BusInfor,String> {
    Set<BusInfor> getAll();
}
