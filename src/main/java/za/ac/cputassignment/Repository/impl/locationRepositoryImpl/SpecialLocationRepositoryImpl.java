package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.SpecialLocationRepository;
import za.ac.cputassignment.domain.location.SpecialLocation;

import java.util.HashSet;
import java.util.Set;

public class SpecialLocationRepositoryImpl implements SpecialLocationRepository {


    private static SpecialLocationRepositoryImpl repository = null;
    private Set<SpecialLocation> specialLocations;


    private SpecialLocationRepositoryImpl()
    {
        this.specialLocations =new HashSet<>();
    }

    public static SpecialLocationRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new SpecialLocationRepositoryImpl();
        return repository;
    }





    private SpecialLocation findSpecialLocation(String lId)
    {
        return this.specialLocations.stream()
                .filter(specialLocation -> specialLocation.getId().trim().equals(lId))
                .findAny()
                .orElse(null);
    }


    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        this.specialLocations.add(specialLocation);
        return specialLocation;
    }

    @Override
    public SpecialLocation read(String s) {
        SpecialLocation specialLocation =findSpecialLocation(s);
        return specialLocation;
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
        SpecialLocation specialLocation1 =findSpecialLocation(specialLocation.getId());
        if(specialLocation1 !=null)
        {
            this.specialLocations.remove(specialLocation1);
            return create(specialLocation);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        SpecialLocation specialLocation =findSpecialLocation(s);
        if(specialLocation !=null) this.specialLocations.remove(specialLocation);
    }



    @Override
    public Set<SpecialLocation> getAll() {
        return this.specialLocations;
    }

}
