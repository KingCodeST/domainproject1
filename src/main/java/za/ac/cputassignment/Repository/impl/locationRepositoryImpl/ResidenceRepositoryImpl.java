package za.ac.cputassignment.Repository.impl.locationRepositoryImpl;

import za.ac.cputassignment.Repository.LocationRepository.ResidenceRepository;
import za.ac.cputassignment.domain.location.Residence;

import java.util.HashSet;
import java.util.Set;

public class ResidenceRepositoryImpl implements ResidenceRepository {

    private static ResidenceRepositoryImpl repository =null;
    private Set<Residence> residences;


    private ResidenceRepositoryImpl()
    {
        this.residences =new HashSet<>();
    }

    private Residence findResidence(String rezId)
    {
        return this.residences.stream()
                              .filter(residence -> residence.getId().trim().equals(rezId))
                                .findAny()
                                .orElse(null);
    }

    public static ResidenceRepositoryImpl getRepository()
    {
        if(repository == null) repository =new ResidenceRepositoryImpl();
        return repository;
    }



    @Override
    public Residence create(Residence residence) {
        this.residences.add(residence);

        return residence;
    }

    @Override
    public Residence read(String s) {
        Residence residence=findResidence(s);
        return residence;
    }

    @Override
    public Residence update(Residence residence) {
        Residence residence1 =findResidence(residence.getId());
        if(residence1 !=null)
        {
            this.residences.remove(residence1);
            return create(residence);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Residence residence =findResidence(s);
        if(residence !=null) this.residences.remove(residence);
    }



    @Override
    public Set<Residence> getAll() {
        return this.residences;
    }


}
