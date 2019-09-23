package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.ResidenceLocationRepository;
import za.ac.cputassignment.domain.location.ResidenceLocation;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class ResidenceLocationRepositoryImpl implements ResidenceLocationRepository {


    private static ResidenceLocationRepositoryImpl repository =null;
    private Set<ResidenceLocation> residenceLocationID;

    private ResidenceLocationRepositoryImpl(){
        this.residenceLocationID =new HashSet<>();
    }

    private ResidenceLocation findArletInfor(String residenceLocationId)
    {
        return this.residenceLocationID.stream()
                .filter(ResidenceLocation -> ResidenceLocation.getResidenceLocationId().trim().equals(residenceLocationId))
                .findAny()
                .orElse(null);
    }

    public static ResidenceLocationRepositoryImpl getRepository(){
        if(repository ==null) repository=new ResidenceLocationRepositoryImpl();
        return repository;
    }

    @Override
    public Set<ResidenceLocation> getAll() {
        return this.residenceLocationID;
    }

    @Override
    public ResidenceLocation create(ResidenceLocation residenceLocation) {
        this.residenceLocationID.add(residenceLocation);
        return residenceLocation;
    }

    @Override
    public ResidenceLocation read(String residenceLocationID) {
        ResidenceLocation residenceLocation=findArletInfor(residenceLocationID);
        return residenceLocation;
    }

    @Override
    public ResidenceLocation update(ResidenceLocation residenceLocation) {
        ResidenceLocation toDelete =findArletInfor(residenceLocation.getResidenceLocationId());
        if(toDelete !=null)
        {
            this.residenceLocationID.remove(toDelete);
            return create(residenceLocation);
        }
        return null;
    }

    @Override
    public void delete(String residenceLocationID) {
        ResidenceLocation residenceLocation=findArletInfor(residenceLocationID);
        if (residenceLocation !=null) this.residenceLocationID.remove(residenceLocation);

    }
}

