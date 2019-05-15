package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusDriverRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.domain.transport.BusInfor;

import java.util.*;
@Repository("InMemory")
public class BusInforRepositoryImpl implements BusInforRepository {



    private static BusInforRepositoryImpl repository=null;
    private Map<String,BusInfor> busSetRepo;

    private BusInforRepositoryImpl()
    {
        this.busSetRepo =new HashMap<>();
    }


    public static BusInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new BusInforRepositoryImpl();
        return repository;
    }



    @Override
    public BusInfor create(BusInfor busInfor) {
        this.busSetRepo.put(busInfor.getId(),busInfor);
        return busInfor;
    }

    @Override
    public BusInfor read(String busInforId) {
        return this.busSetRepo.get(busInforId);
    }


    @Override
    public BusInfor update(BusInfor busInfor) {
        this.busSetRepo.replace(busInfor.getId(),busInfor);
        return this.busSetRepo.get(busInfor.getId());
    }

    @Override
    public void delete(String busInforId) {
        this.busSetRepo.remove(busInforId);
    }



    @Override
    public Set<BusInfor> getAll() {
        Collection<BusInfor> busInfors =busSetRepo.values();
        Set<BusInfor> set=new HashSet<>();
        set.addAll(busInfors);
        return set;
    }

}
