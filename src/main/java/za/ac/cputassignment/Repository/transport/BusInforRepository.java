package za.ac.cputassignment.Repository.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.BusInfor;

import java.util.Set;

@Repository("BusInforRepository")
public interface BusInforRepository extends JpaRepository<BusInfor,String> {

}
