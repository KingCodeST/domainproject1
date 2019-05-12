package za.ac.cputassignment.service.service.LocationService;

import org.springframework.web.filter.ShallowEtagHeaderFilter;
import za.ac.cputassignment.domain.location.LocationInfor;
import za.ac.cputassignment.service.IService;

import java.util.Set;

public interface LocationInforService extends IService<LocationInfor,String> {
    Set<LocationInfor> getAll();
}
