package za.ac.cputassignment.Controller.eventTrigger;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cputassignment.domain.eventTrigger.ArletInfor;
import za.ac.cputassignment.factory.eventTrigger.ArletInforFactory;

import static org.junit.Assert.*;

public class ArletInforControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/domainproject1";

    @Test
    public void create() {
        ArletInfor arletInfor = ArletInforFactory.GenericBuilder("Green","Gray","Brown");

        ResponseEntity<ArletInfor> responseEntity = restTemplate.postForEntity(baseURL + "/create", arletInfor, ArletInfor.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String reservationID = "76263th";
        ArletInfor arletInfor = restTemplate.getForObject(baseURL + "/arletInfor/" +reservationID, ArletInfor.class);

        restTemplate.put(baseURL + "/arletInfor/" +reservationID, arletInfor);
        ArletInfor updatedArletInfor = restTemplate.getForObject(baseURL + "/ArletInfor/" +reservationID, ArletInfor.class);
        assertNotNull(updatedArletInfor);
    }

    @Test
    public void delete() {
        String reservationID = "645gd";
        ArletInfor arletInfor = restTemplate.getForObject(baseURL + "/arletInfors/"+reservationID, ArletInfor.class);
        assertNotNull(arletInfor);
        restTemplate.delete(baseURL + "/arletInfors/" + reservationID);
        try {
            arletInfor = restTemplate.getForObject(baseURL + "/arletInfors/" + reservationID, ArletInfor.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetArletInfor() {
        ArletInfor arletInfor = restTemplate.getForObject(baseURL +"/arletInfor/1", ArletInfor.class);
        System.out.println(arletInfor.getAlertInforId());
        assertNotNull(arletInfor);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}