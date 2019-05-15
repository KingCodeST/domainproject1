package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.*;

public class SpecialLocationRepositoryImpl implements SpecialLocationRepository {


    private static SpecialLocationRepositoryImpl repository = null;
    private Map<String,SpecialLocation> specialLocations;


    private SpecialLocationRepositoryImpl()
    {
        this.specialLocations =new HashMap<>();
    }

    public static SpecialLocationRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new SpecialLocationRepositoryImpl();
        return repository;
    }





    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        this.specialLocations.put(specialLocation.getId(),specialLocation);
        return specialLocation;
    }

    @Override
    public SpecialLocation read(String s) {
       return this.specialLocations.get(s);

    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
       this.specialLocations.replace(specialLocation.getId(),specialLocation);
       return this.specialLocations.get(specialLocation.getId());
    }

    @Override
    public void delete(String specialloId) {
        this.specialLocations.remove(specialloId);
    }



    @Override
    public Set<SpecialLocation> getAll() {
        Collection<SpecialLocation> specialLocations1 =this.specialLocations.values();
        Set<SpecialLocation> set =new HashSet<>();
        set.addAll(specialLocations1);
        return set;
    }

}
