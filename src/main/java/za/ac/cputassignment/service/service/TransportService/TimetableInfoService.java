package za.ac.cputassignment.service.service.TransportService;

import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface TimetableInfoService extends IService<TimetableInfo,String> {
    Set<TimetableInfo> getAll();
}
