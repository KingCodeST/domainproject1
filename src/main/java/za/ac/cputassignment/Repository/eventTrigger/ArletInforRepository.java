package za.ac.cputassignment.Repository.eventTrigger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.Set;

@Repository("ArletInforRepository")
public interface ArletInforRepository extends JpaRepository<ArletInfor,String> {

}
