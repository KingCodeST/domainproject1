package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.trasportRepository.VanRepository;
import za.ac.cputassignment.domain.transport.Van;

import java.util.*;
import java.util.stream.Stream;
@Repository("InMemory")
public class VanRepositoryImpl implements VanRepository {

    private  static VanRepositoryImpl repository=null;
    private Map<String,Van> vans;

    private VanRepositoryImpl()
    {
        this.vans =new HashMap<>();
    }




    public static VanRepository getRepository()
    {
        if(repository ==null) repository =new VanRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Van> getAll() {
        Collection<Van> vans =this.vans.values();
        Set<Van> set=new HashSet<>();
        set.addAll(vans);
        return set;
    }

    @Override
    public Van create(Van van) {
        this.vans.put(van.getVanId(),van);
        return van;
    }

    @Override
    public Van update(Van van) {
        this.vans.replace(van.getVanId(),van);
        return this.vans.get(van.getVanId());
    }

    @Override
    public void delete(String vanId) {
       this.vans.remove(vanId);
    }

    @Override
    public Van read( String vanId) {
        return this.vans.get(vanId);
    }
}
