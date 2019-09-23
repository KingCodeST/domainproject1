package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class SpecialLocationRepositoryImpl implements SpecialLocationRepository {

    private static SpecialLocationRepositoryImpl repository =null;
    private Set<SpecialLocation> specialLocationset;

    private SpecialLocationRepositoryImpl(){
        this.specialLocationset =new HashSet<>();
    }

    private SpecialLocation findArletInfor(String specialLocationsId)
    {
        return this.specialLocationset.stream()
                .filter(SpecialLocation -> SpecialLocation.getSLocalId().trim().equals(specialLocationsId))
                .findAny()
                .orElse(null);
    }

    public static SpecialLocationRepositoryImpl getRepository(){
        if(repository ==null) repository=new SpecialLocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<SpecialLocation> getAll() {
        return this.specialLocationset;
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocationsob) {
        this.specialLocationset.add(specialLocationsob);
        return specialLocationsob;
    }

    @Override
    public SpecialLocation read(String residenceLocationID) {
        SpecialLocation specialLocationsob=findArletInfor(residenceLocationID);
        return specialLocationsob;
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocationsob) {
        SpecialLocation toDelete =findArletInfor(specialLocationsob.getSLocalId());
        if(toDelete !=null)
        {
            this.specialLocationset.remove(toDelete);
            return create(specialLocationsob);
        }
        return null;
    }

    @Override
    public void delete(String specialLocationsId) {
        SpecialLocation specialLocationsob=findArletInfor(specialLocationsId);
        if (specialLocationsob !=null) this.specialLocationset.remove(specialLocationsob);

    }
}
