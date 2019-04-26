package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.Set;

public class ResidenceRepositoryImpl implements ResidenceRepository {

    private static ResidenceRepositoryImpl repository =null;
    private Set<Residence> residences;

    public static ResidenceRepository getRepository()
    {
        if(repository == null) repository =new ResidenceRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Residence> getAll() {
        return this.residences;
    }

    @Override
    public Residence create(Residence residence) {
        this.residences.add(residence);

        return residence;
    }

    @Override
    public Residence update(Residence residence) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Residence read(String s) {
        return null;
    }
}
