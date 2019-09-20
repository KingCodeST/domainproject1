package za.ac.cputassignment.service.service.Impl.TransportServiceImpl;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl.TimetableInforRepositoryImpl;
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
        return this.repository.getAll();
    }

    @Override
    public TimetableInfo create(TimetableInfo timetableInfo) {
        return this.repository.create(timetableInfo);
    }

    @Override
    public TimetableInfo read(String s) {
        return this.repository.read(s);
    }

    @Override
    public TimetableInfo update(TimetableInfo timetableInfo) {
        return this.repository.update(timetableInfo);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
