package za.ac.cputassignment.Controller.eventTriggerController;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTriggerFactory.ArletInforFactory;

import java.net.http.HttpHeaders;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ArletInforControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL ="http://local:8080/ArletInfor";


    @Test
    public void testGetAllArletInfors()
    {
        HttpHeaders headers =new HttpHeaders();


        HttpHeaders<String> entity =new HttpEntity<String>(null,headers);
        ResponseEntity<String> response =restTemplate.exchange(baseURL +"/read/all",
        HttpMethod.GET,entity,String.class);

        assertNotNull(response.getBody());

    }

    @Ignore
    public void testGetArletInforById()
    {
        ArletInfor arletInfor=restTemplate.getForObject(baseURL +"/arletInfor/1",ArletInfor.class);
        System.out.println(arletInfor.getBlue());


        assertNotNull(arletInfor);
    }

    @Ignore
    public void testCreateAlertInfor(){

        ArletInfor arletInfor = ArletInforFactory.getArlet("4D","Blue","Green","Black");

        ResponseEntity<ArletInfor> postResponse =restTemplate.postForEntity(baseURL +"/create",arletInfor,ArletInfor.class)
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }


    @Ignore
    public void testUpdateArletInfor()
    {
        int id =1;
        ArletInfor arletInfor =restTemplate.getForObject(baseURL +"/arletInfor",ArletInfor.class);

        restTemplate.put(baseURL +"/student/"+id, arletInfor);
        ArletInfor updatedArletInfor =restTemplate.getForObject(baseURL +"/arletInfor"+id, ArletInfor.class);
        assertNotNull(updatedArletInfor);
    }

    @Ignore
    public void testDeleteEmployee()
    {
        int id=2;
        ArletInfor arletInfor =restTemplate.getForObject(baseURL+"/arletInfor/"+id,ArletInfor.class);
        assertNotNull(arletInfor);
        restTemplate.delete(baseURL+"/arletInfor/"+id);
        try
        {
            arletInfor =restTemplate.getForObject(baseURL+"/arletInfor/"+id,ArletInfor.class);
        }catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }


}