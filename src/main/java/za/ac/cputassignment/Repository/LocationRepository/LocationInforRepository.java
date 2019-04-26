package za.ac.cputassignment.Repository.LocationRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.location.LocationInfor;

import java.util.Set;

public interface LocationInforRepository extends IRepository<LocationInfor,String> {

    Set<LocationInfor>getAll();
}
