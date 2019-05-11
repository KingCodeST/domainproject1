package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.locationFactory.CampusFactory;

import java.util.Set;


public class CampusRepositoryImpl implements CampusRepository {

    private static CampusRepositoryImpl repository=null;
    private Set<Campus> campusSet;
    Campus campuss;
    CampusFactory campusFactory;

    private Campus findCampus(String campusId)
    {
        return this.campusSet.stream()
                             .filter(campus -> campus.getCampusId().trim().equals(campusId))
                             .findAny()
                             .orElse(null);
    }

    public static CampusRepositoryImpl getRepository()
    {
        if(repository==null) repository =new CampusRepositoryImpl();
        return repository;
    }

    public Campus create(Campus campus)
    {
        this.campusSet.add(campus);
        return campus;
    }

    public Campus read(String campusId)
    {
        Campus campus =findCampus(campusId);
        return campus;
    }

    public void delete(String campusId)
    {
        Campus deleteCamp=findCampus(campusId);
        if(deleteCamp !=null)this.campusSet.remove(deleteCamp);

    }

    public Campus update(Campus campus)
    {
        Campus campus1 =findCampus(campus.getCampusId());
        if(campus1 !=null)
        {
            this.campusSet.remove(campus1);
            return this.create(campus1);
        }
        return null;
    }

    public Set<Campus> getAll()
    {
        return this.campusSet;
    }


}
