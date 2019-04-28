package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.LocationRepository;
import za.ac.cputassignment.domain.location.Location;

import java.util.HashSet;
import java.util.Set;

public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepositoryImpl repository =null;
    private Set<Location> locations;

    private LocationRepositoryImpl(){
        this.locations =new HashSet<>();
    }

    public static LocationRepository getRepository()
    {
        if(repository  == null)repository =new LocationRepositoryImpl();
        return repository;
    }

    public Location create(Location location)
    {
        this.locations.add(location);
        return location;
    }

    public Location read(String locationId)
    {
        this.locations.containsAll(getAll());
        return null;
    }

    public Location update(Location location)
    {
        this.create(location);

        return null;
    }

    public void delete(String student)
    {
        this.locations.remove(student);
    }

    public Set<Location> getAll()
    {
        return this.locations;
    }


}
