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

        return repository.read(campusId);
    }

    public void delete(String campusId)
    {
        this.campusSet.remove(campusId);


    }

    public Campus update(Campus campus)
    {
        this.campusSet.addAll(getAll());
        return campus;
    }

    public Set<Campus> getAll()
    {
        return this.campusSet;
    }


}
