package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.Repository.eventTriggerRepository.TimetableInforRepository;
import za.ac.cputassignment.domain.eventTrigger.TimetableInfo;
import za.ac.cputassignment.factory.transportFactory.TimetableInfoFactory;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimetableInforRepositoryImplTest {

    private TimetableInforRepository repository;
    private TimetableInfo timetableInfo;

    private TimetableInfo getTimetableInfoSaved()
    {
        Set<TimetableInfo> savedTimetableinfor =this.repository.getAll();
        return savedTimetableinfor.iterator().next();
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