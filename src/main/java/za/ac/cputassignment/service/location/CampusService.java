package za.ac.cputassignment.service.location;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.service.IService;

import java.util.List;
import java.util.Set;

@Service("CampusService")
public interface CampusService  extends IService<Campus,String> {
  //  Campus retrieveByDesc(String campusDesc);
    Set<Campus> getAll();
}
