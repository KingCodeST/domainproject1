package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.trasportRepository.VanRepository;
import za.ac.cputassignment.domain.transport.Van;

import java.util.HashSet;
import java.util.Set;

public class VanRepositoryImpl implements VanRepository {

    private  static VanRepositoryImpl repository=null;
    private Set<Van> vans;

    private VanRepositoryImpl()
    {
        this.vans =new HashSet<>();
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
    public void delete(String s) {

    }

    @Override
    public Van read(String s) {
        return null;
    }
}
