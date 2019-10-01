package za.ac.cputassignment.Repository.location.impl;


import za.ac.cputassignment.Repository.location.SpecialLocationLRepository;
import za.ac.cputassignment.domain.location.SpecialLocationL;

import java.util.HashSet;
import java.util.Set;


public class SpecialLocationLRepositoryImpl implements SpecialLocationLRepository {

    private static SpecialLocationLRepositoryImpl repository =null;
    private Set<SpecialLocationL> specialLocationLset;

    private SpecialLocationLRepositoryImpl(){
        this.specialLocationLset =new HashSet<>();
    }

    private SpecialLocationL FindSpecialLocationL(String specialLocationLId)
    {
        return this.specialLocationLset.stream()
                .filter(specialLocationL -> specialLocationL.getSpecialLId().trim().equals(specialLocationLId))
                .findAny()
                .orElse(null);
    }

    public static SpecialLocationLRepositoryImpl getRepository(){
        if(repository ==null) repository=new SpecialLocationLRepositoryImpl();
        return repository;
    }

    @Override
    public Set<SpecialLocationL> getAll() {
        return this.specialLocationLset;
    }

    @Override
    public SpecialLocationL create(SpecialLocationL specialLocationLOb) {
        this.specialLocationLset.add(specialLocationLOb);
        return specialLocationLOb;
    }

    @Override
    public SpecialLocationL read(String specialLId) {
        SpecialLocationL specialLocationLOb=FindSpecialLocationL(specialLId);
        return specialLocationLOb;
    }

    @Override
    public SpecialLocationL update(SpecialLocationL specialLocationLOb) {
        SpecialLocationL toDelete =FindSpecialLocationL(specialLocationLOb.getSpecialLId());
        if(toDelete !=null)
        {
            this.specialLocationLset.remove(toDelete);
            return create(specialLocationLOb);
        }
        return null;
    }

    @Override
    public void delete(String ResidenceLocationID) {
        SpecialLocationL specialLocationLOb=FindSpecialLocationL(ResidenceLocationID);
        if (specialLocationLOb !=null) this.specialLocationLset.remove(specialLocationLOb);

    }
}

