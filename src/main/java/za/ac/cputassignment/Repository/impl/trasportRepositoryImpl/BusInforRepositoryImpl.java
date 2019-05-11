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
    private Set<BusInfor> busSetRepo;

    private BusInforRepositoryImpl()
    {
        this.busSetRepo =new HashSet<>();
    }

    private BusInfor findBusinfor(String businfId)
    {
        return this.busSetRepo.stream().filter(busInfor -> busInfor.getId().trim().equals(businfId))
                                .findAny()
                                .orElse(null);

    }

    public static BusInforRepositoryImpl getRepository()
    {
        if(repository ==null) repository =new BusInforRepositoryImpl();
        return repository;
    }



    @Override
    public BusInfor create(BusInfor busInfor) {
        this.busSetRepo.add(busInfor);
        return busInfor;
    }

    @Override
    public BusInfor read(String busInforId) {
        BusInfor busInfor=findBusinfor(busInforId);
        return busInfor;
    }


    @Override
    public BusInfor update(BusInfor busInfor) {
        BusInfor busInfor1=findBusinfor(busInfor.getId());
        if(busInfor1 !=null)
        {
            this.busSetRepo.remove(busInfor);
            return create(busInfor);
        }
        return null;
    }

    @Override
    public void delete(String busInforId) {
        BusInfor busInfor=findBusinfor(busInforId);
        if(busInfor ==null) this.busSetRepo.remove(busInfor);
    }



    @Override
    public Set<BusInfor> getAll() {
        return this.busSetRepo;
    }

}
