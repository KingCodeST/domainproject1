package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.TimetableInforRepositoryImpl;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;
import za.ac.cputassignment.service.service.TransportService.TimetableInfoService;

import java.util.Set;

@Service
public class TimetableInfoServiceImpl implements TimetableInfoService {

    private static TimetableInfoServiceImpl service=null;
    private TimetableInforRepository repository;

    private TimetableInfoServiceImpl()
    {
        this.repository = TimetableInforRepositoryImpl.getRepository();
    }

    public static TimetableInfoServiceImpl getService()
    {
        if(service==null) service =new TimetableInfoServiceImpl();
        return  service;
    }

    @Override
    public Set<TimetableInfo> getAll() {
        return null;
    }

    @Override
    public TimetableInfo create(TimetableInfo timetableInfo) {
        return null;
    }

    @Override
    public TimetableInfo read(String s) {
        return null;
    }

    @Override
    public TimetableInfo update(TimetableInfo timetableInfo) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
