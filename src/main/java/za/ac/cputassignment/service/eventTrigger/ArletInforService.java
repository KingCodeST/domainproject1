package za.ac.cputassignment.service.eventTrigger;

import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

public interface ArletInforService extends IService<ArletInfor,String> {
    ArletInfor retrieveByDesc(String arletDesc);
    List<ArletInfor> getAll();
}
