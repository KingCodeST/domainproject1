package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.locationFactory.CampusFactory;

import java.util.*;

@Repository()
public class CampusRepositoryImpl implements CampusRepository {

    private static CampusRepositoryImpl repository=null;
    private Map<String,Campus> campusSet;

    private CampusRepositoryImpl()
    {
        this.campusSet =new HashMap<>();
    }



    public static CampusRepositoryImpl getRepository()
    {
        if(repository==null) repository =new CampusRepositoryImpl();
        return repository;
    }

    public Campus create(Campus campus)
    {
        this.campusSet.put(campus.getCampusId(),campus);
        return campus;
    }

    public Campus read(String campusId)
    {
       return this.campusSet.get(campusId);
    }

    public void delete(String campusId)
    {
        this.campusSet.remove(campusId);
    }

    public Campus update(Campus campus)
    {
        this.campusSet.replace(campus.getCampusId(),campus);
        return this.campusSet.get(campus.getCampusId());
    }

    public Set<Campus> getAll()
    {
        Collection<Campus> campuses=this.campusSet.values();
        Set<Campus> set =new HashSet<>();
        set.addAll(campuses);
        return set;
    }


}
