package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.CampusRepository;
import za.ac.cputassignment.domain.location.Campus;

import java.util.HashSet;
import java.util.Set;


public class CampusRepositoryImpl implements CampusRepository {
    
    private static CampusRepositoryImpl repository =null;
    private Set<Campus> campuss;

    private CampusRepositoryImpl(){
        this.campuss =new HashSet<>();
    }

    private Campus findArletInfor(String campusId)
    {
        return this.campuss.stream()
                .filter(campus -> campus.getCampusId().trim().equals(campusId))
                .findAny()
                .orElse(null);
    }

    public static CampusRepositoryImpl getRepository(){
        if(repository ==null) repository=new CampusRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Campus> getAll() {
        return this.campuss;
    }

    @Override
    public Campus create(Campus campus) {
        this.campuss.add(campus);
        return campus;
    }

    @Override
    public Campus read(String campusId) {
        Campus campus=findArletInfor(campusId);
        return campus;
    }

    @Override
    public Campus update(Campus campus) {
        Campus toDelete =findArletInfor(campus.getCampusId());
        if(toDelete !=null)
        {
            this.campuss.remove(toDelete);
            return create(campus);
        }
        return null;
    }

    @Override
    public void delete(String campusId) {
        Campus campus=findArletInfor(campusId);
        if (campus !=null) this.campuss.remove(campus);

    }
}
