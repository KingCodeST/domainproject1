package za.ac.cputassignment.service.service.Impl.eventTriggerServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.ArletInforRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.ArletInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.service.service.eventTriggerService.ArletInforService;

import java.util.Set;

@Service
public class ArletInforServiceImpl implements ArletInforService {

    private static  ArletInforServiceImpl service=null;
    private ArletInforRepository repository;

    private ArletInforServiceImpl() {
        this.repository = ArletInforRepositoryImpl.getRepository();
    }

    public static ArletInforServiceImpl getService()
    {
        if(service ==null) service =new ArletInforServiceImpl();
        return service;
    }

    @Override
    public Set<ArletInfor> getAll() {
        return null;
    }

    @Override
    public ArletInfor create(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public ArletInfor read(String s) {
        return null;
    }

    @Override
    public ArletInfor update(ArletInfor arletInfor) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
