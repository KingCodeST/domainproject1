package za.ac.cputassignment.Repository.location.impl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.location.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.HashSet;
import java.util.Set;


public class ResidenceRepositoryImpl implements ResidenceRepository {


    private static ResidenceRepositoryImpl repository =null;
    private Set<Residence> residenceset;

    private ResidenceRepositoryImpl(){
        this.residenceset =new HashSet<>();
    }

    private Residence findArletInfor(String ResidenceId)
    {
        return this.residenceset.stream()
                .filter(Residence -> Residence.getResidenceID().trim().equals(ResidenceId))
                .findAny()
                .orElse(null);
    }

    public static ResidenceRepositoryImpl getRepository(){
        if(repository ==null) repository=new ResidenceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Residence> getAll() {
        return this.residenceset;
    }

    @Override
    public Residence create(Residence residence) {
        this.residenceset.add(residence);
        return residence;
    }

    @Override
    public Residence read(String residenceLocationID) {
        Residence residence=findArletInfor(residenceLocationID);
        return residence;
    }

    @Override
    public Residence update(Residence residence) {
        Residence toDelete =findArletInfor(residence.getResidenceID());
        if(toDelete !=null)
        {
            this.residenceset.remove(toDelete);
            return create(residence);
        }
        return null;
    }

    @Override
    public void delete(String ResidenceLocationID) {
        Residence residence=findArletInfor(ResidenceLocationID);
        if (residence !=null) this.residenceset.remove(residence);

    }
}

