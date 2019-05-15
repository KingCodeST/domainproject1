package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.*;

public class ResidenceRepositoryImpl implements ResidenceRepository {

    private static ResidenceRepositoryImpl repository =null;
    private Map<String,Residence> residences;


    private ResidenceRepositoryImpl()
    {
        this.residences =new HashMap<>();
    }



    public static ResidenceRepositoryImpl getRepository()
    {
        if(repository == null) repository =new ResidenceRepositoryImpl();
        return repository;
    }



    @Override
    public Residence create(Residence residence) {
        this.residences.put(residence.getId(),residence);
        return residence;
    }

    @Override
    public Residence read(String residenceId) {
        return  this.residences.get(residenceId);
    }

    @Override
    public Residence update(Residence residence) {
       this.residences.replace(residence.getId(),residence);
       return this.residences.get(residence.getId());
    }

    @Override
    public void delete(String residenceId) {
        this.residences.remove(residenceId);
    }



    @Override
    public Set<Residence> getAll() {
        Collection<Residence> residences1=this.residences.values();
        Set<Residence> set =new HashSet<>();
        return set;

    }


}
