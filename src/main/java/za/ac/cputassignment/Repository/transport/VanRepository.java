package za.ac.cputassignment.Repository.transport;

import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.Van;

import java.util.Set;

public interface VanRepository extends IRepository<Van,String> {
    Set<Van>getAll();
}
