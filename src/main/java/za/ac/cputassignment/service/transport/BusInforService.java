package za.ac.cputassignment.service.transport;

import za.ac.cputassignment.domain.transport.BusInfor;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface BusInforService extends IService<BusInfor,String> {
    BusInfor retrieveByDesc(String businforDesc);
    List<BusInfor> getAll();
}
