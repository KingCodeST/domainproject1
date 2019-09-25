package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.SportFieldLocationRepository;
import za.ac.cputassignment.domain.location.SportFieldLocation;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class SportFieldLocationRepositoryImpl implements SportFieldLocationRepository {

    private static SportFieldLocationRepositoryImpl repository =null;
    private Set<SportFieldLocation> sportFieldLocationset;

    private SportFieldLocationRepositoryImpl(){
        this.sportFieldLocationset =new HashSet<>();
    }

    private SportFieldLocation findSportFieldLocation(String sportFieldLocationId)
    {
        return this.sportFieldLocationset.stream()
                .filter(sportFieldLocation -> sportFieldLocation.getSportFiledId().trim().equals(sportFieldLocationId))
                .findAny()
                .orElse(null);
    }

    public static SportFieldLocationRepositoryImpl getRepository(){
        if(repository ==null) repository=new SportFieldLocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<SportFieldLocation> getAll() {
        return this.sportFieldLocationset;
    }

    @Override
    public SportFieldLocation create(SportFieldLocation sportFieldLocationOb) {
        this.sportFieldLocationset.add(sportFieldLocationOb);
        return sportFieldLocationOb;
    }

    @Override
    public SportFieldLocation read(String residenceLocationID) {
        SportFieldLocation sportFieldLocationOb=findSportFieldLocation(residenceLocationID);
        return sportFieldLocationOb;
    }

    @Override
    public SportFieldLocation update(SportFieldLocation sportFieldLocationOb) {
        SportFieldLocation toDelete =findSportFieldLocation(sportFieldLocationOb.getSportFiledId());
        if(toDelete !=null)
        {
            this.sportFieldLocationset.remove(toDelete);
            return create(sportFieldLocationOb);
        }
        return null;
    }

    @Override
    public void delete(String sportFieldLocationId) {
        SportFieldLocation sportFieldLocationOb=findSportFieldLocation(sportFieldLocationId);
        if (sportFieldLocationOb !=null) this.sportFieldLocationset.remove(sportFieldLocationOb);

    }
}
