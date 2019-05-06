package za.ac.cputassignment.service;

import org.springframework.stereotype.Service;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;

import java.util.Arrays;
import java.util.List;

@Service
public class ArletinforService {


    private List<ArletInfor> arletInfors =
    Arrays.asList(
                new ArletInfor("Spring","Adp","2019","Study"),
                new ArletInfor("gray","Black","Fire","Orange"),
                new ArletInfor("Greate","Kali","Greye","Green"),
                new ArletInfor("bage","Bluer","Light","Brown"),
                new ArletInfor("Brom","Slevel","Just","For Control")
        );

    public List<ArletInfor> gettAllArlets()
    {
        return arletInfors;
    }

    public ArletInfor getArlets(String id)
    {
        return arletInfors.stream().filter(g->g.getBlue().equals(id)).findFirst().get();
    }




}
