package za.ac.cputassignment.service.service.TransportService;

import za.ac.cputassignment.domain.transport.Van;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface VanService extends IService<Van,String> {
    Set<Van> getAll();
}