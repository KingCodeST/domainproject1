package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.trasportRepository.VanRepository;
import za.ac.cputassignment.domain.transport.Van;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class VanRepositoryImpl implements VanRepository {

    private  static VanRepositoryImpl repository=null;
    private Set<Van> vans;

    private VanRepositoryImpl()
    {
        this.vans =new HashSet<>();
    }


    private Van findVan(String vanId)
    {
        return this.vans.stream()
                .filter(van -> van.getVanId().trim().equals(vanId)).findAny().orElse(null);
    }

    public static VanRepository getRepository()
    {
        if(repository ==null) repository =new VanRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Van> getAll() {
        return this.vans;
    }

    @Override
    public Van create(Van van) {
        this.vans.add(van);
        return van;
    }

    @Override
    public Van update(Van van) {
        return null;
    }

    @Override
    public void delete(String vanId) {
       Van van=findVan(vanId);
        if(van !=null) this.vans.remove(van);


    }

    @Override
    public Van read( String vanId) {
        Van van= findVan(vanId);
        return van;
    }
}
