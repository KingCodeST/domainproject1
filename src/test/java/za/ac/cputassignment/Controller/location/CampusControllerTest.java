package za.ac.cputassignment.Controller.location;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cputassignment.domain.location.Campus;
import za.ac.cputassignment.factory.location.CampusFactory;

import static org.junit.Assert.*;

public class CampusControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/domainproject1";

    @Test
    public void create() {
        Campus campus = CampusFactory.GenericBuilder("Catsville");

        ResponseEntity<Campus> responseEntity = restTemplate.postForEntity(baseURL + "/create", campus, Campus.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String reservationID = "76263th";
        Campus campus = restTemplate.getForObject(baseURL + "/campus/" +reservationID, Campus.class);

        restTemplate.put(baseURL + "/campus/" +reservationID, campus);
        Campus updatedArletInfor = restTemplate.getForObject(baseURL + "/Campus/" +reservationID, Campus.class);
        assertNotNull(updatedArletInfor);
    }

    @Test
    public void delete() {
        String reservationID = "645gd";
        Campus campus = restTemplate.getForObject(baseURL + "/arletInfors/"+reservationID, Campus.class);
        assertNotNull(campus);
        restTemplate.delete(baseURL + "/arletInfors/" + reservationID);
        try {
            campus = restTemplate.getForObject(baseURL + "/arletInfors/" + reservationID, Campus.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetArletInfor() {
        Campus campus = restTemplate.getForObject(baseURL +"/campus/1", Campus.class);
        System.out.println(campus.getCampusId());
        assertNotNull(campus);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}