package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;
import za.ac.cputassignment.factory.transportFactory.TimetableInfoFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimetableInforRepositoryImplTest {

    private TimetableInforRepository repository;
    private TimetableInfo timetableInfo;

    private TimetableInfo getTimetableInfoSaved()
    {
        Set<TimetableInfo> savedTimetableinfor =this.repository.getAll();
        return savedTimetableinfor.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =TimetableInforRepositoryImpl.getRepository();
        this.timetableInfo = TimetableInfoFactory.getTimetableInfo();

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}