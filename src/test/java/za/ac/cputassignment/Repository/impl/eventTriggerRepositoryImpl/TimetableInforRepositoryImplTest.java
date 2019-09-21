package za.ac.cputassignment.Repository.impl.eventTriggerRepositoryImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cputassignment.factory.transportFactory.TimetableInfoFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimetableInforRepositoryImplTest {

    @Autowired
    private TimetableInforRepository repository;
    private String TimetableInfoID=null;

    @Test
    public void TimetableInforCreateTest() throws IOException
    {
        TimetableInfo timetableInfo=TimetableInfoFactory.getTimetableInfo("");
        TimetableInfo result= repository.create(timetableInfo);
        TimetableInfoID =result.getId();
        Assert.assertNotNull(timetableInfo);
    }

    @Test
    public  void SiteTimetableInfoTest() throws  IOException
    {
        TimetableInfo timetableInfo =repository.read(TimetableInfoID);
        Assert.assertNotNull(timetableInfo);
    }



}