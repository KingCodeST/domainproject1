package za.ac.cputassignment.service.service.eventTriggerService;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface ArletInforService extends IService<ArletInfor,String> {
    Set<ArletInfor> getAll();
}
