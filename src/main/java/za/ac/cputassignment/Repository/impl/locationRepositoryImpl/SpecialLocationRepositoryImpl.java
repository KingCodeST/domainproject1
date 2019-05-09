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



    @Override
    public Set<SpecialLocation> getAll() {
        return this.specialLocations;
    }

    @Override
    public SpecialLocation create(SpecialLocation specialLocation) {
        this.specialLocations.add(specialLocation);
        return specialLocation;
    }

    @Override
    public SpecialLocation update(SpecialLocation specialLocation) {
        return null;
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public SpecialLocation read(String s) {
        return null;
    }
}
