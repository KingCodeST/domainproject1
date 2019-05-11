package za.ac.cputassignment.Repository.impl.trasportRepositoryImpl;

import za.ac.cputassignment.Repository.impl.personRepositoryImpl.BusDriverRepositoryImpl;
import za.ac.cputassignment.Repository.personRepository.BusDriverRepository;
import za.ac.cputassignment.Repository.trasportRepository.BusInforRepository;
import za.ac.cputassignment.domain.person.BusDriver;
import za.ac.cputassignment.domain.transport.BusInfor;

import java.util.HashSet;
import java.util.Set;

public class BusInforRepositoryImpl implements BusInforRepository {



    private static BusInforRepositoryImpl repository=null;
    private Set<BusInforRepository> busInforRepositorySet;

    private BusInforRepositoryImpl()
    {
        this.busInforRepositorySet =new HashSet<>();
    }



    private BusInfor findBus(String busId)
    {
        return this.busInforRepositorySet.stream()
                                        .filter(busInforRepository -> busInforRepository.)
    }

    public static BusInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new BusInforRepositoryImpl();
        return repository;
    }


    @Override
    public Set<BusInfor> getAll() {
        return null;
    }

    @Override
    public BusInfor create(BusInfor busInfor) {
        return null;
    }

    @Override
    public BusInfor update(BusInfor busInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BusInfor read(String s) {
        return null;
    }
}
