package za.ac.cputassignment.service.eventTrigger.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.Repository.eventTrigger.RideRepository;
import za.ac.cputassignment.domain.eventTrigger.Ride;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RideServiceImplTest {

    @Mock
    private RideRepository rideRepository;

    @InjectMocks
    private RideServiceImpl rideService;

    private Ride testRide;

    @BeforeEach
    void setUp() {
        testRide = new Ride();
        testRide.setId("RIDE001");
        testRide.setRideNumber("RIDE001");
        testRide.setNameTrip("Campus to Res");
    }

    @Test
    void testCreateRideSuccess() {
        when(rideRepository.save(any(Ride.class))).thenReturn(testRide);

        Ride result = rideService.create(testRide);

        assertNotNull(result);
        assertEquals("RIDE001", result.getId());
        verify(rideRepository, times(1)).save(testRide);
    }

    @Test
    void testCreateRideWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> rideService.create(null));
        verify(rideRepository, never()).save(any());
    }

    @Test
    void testReadRideSuccess() {
        when(rideRepository.findById("RIDE001")).thenReturn(Optional.of(testRide));

        Ride result = rideService.read("RIDE001");

        assertNotNull(result);
        assertEquals("RIDE001", result.getId());
        verify(rideRepository, times(1)).findById("RIDE001");
    }

    @Test
    void testReadRideNotFound() {
        when(rideRepository.findById("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class, 
                () -> rideService.read("INVALID"));
    }

    @Test
    void testReadRideWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> rideService.read(null));
        verify(rideRepository, never()).findById(anyString());
    }

    @Test
    void testUpdateRideSuccess() {
        when(rideRepository.save(any(Ride.class))).thenReturn(testRide);

        Ride result = rideService.update(testRide);

        assertNotNull(result);
        verify(rideRepository, times(1)).save(testRide);
    }

    @Test
    void testUpdateRideWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> rideService.update(null));
        verify(rideRepository, never()).save(any());
    }

    @Test
    void testDeleteRideSuccess() {
        rideService.delete("RIDE001");
        verify(rideRepository, times(1)).deleteById("RIDE001");
    }

    @Test
    void testDeleteRideWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> rideService.delete(null));
        verify(rideRepository, never()).deleteById(anyString());
    }

    @Test
    void testGetAllRides() {
        List<Ride> rides = Arrays.asList(testRide);
        when(rideRepository.findAll()).thenReturn(rides);

        List<Ride> result = rideService.getAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(rideRepository, times(1)).findAll();
    }

    @Test
    void testRetrieveByDescSuccess() {
        when(rideRepository.findByNameTrip("Campus to Res")).thenReturn(Optional.of(testRide));

        Ride result = rideService.retrieveByDesc("Campus to Res");

        assertNotNull(result);
        assertEquals("RIDE001", result.getId());
        verify(rideRepository, times(1)).findByNameTrip("Campus to Res");
    }

    @Test
    void testRetrieveByDescNotFound() {
        when(rideRepository.findByNameTrip("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class,
                () -> rideService.retrieveByDesc("INVALID"));
    }
}

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}