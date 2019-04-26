package za.ac.cputassignment.Repository.trasportRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.transport.BusInfor;

import java.util.Set;

public interface BusInforRepository extends IRepository<BusInfor,String> {

    Set<BusInfor>getAll();

}
