package za.ac.cputassignment.service.transport.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.Repository.transport.VehicleRepository;
import za.ac.cputassignment.domain.transport.Vehicle;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VehicleServiceImplTest {

    @Mock
    private VehicleRepository vehicleRepository;

    @InjectMocks
    private VehicleServiceImpl vehicleService;

    private Vehicle testVehicle;

    @BeforeEach
    void setUp() {
        testVehicle = new Vehicle();
        testVehicle.setId("VEH001");
        testVehicle.setVehicleId("VEH001");
        testVehicle.setName("Vehicle 01");
        testVehicle.setTypeVehicle("Bus");
    }

    @Test
    void testCreateVehicleSuccess() {
        when(vehicleRepository.save(any(Vehicle.class))).thenReturn(testVehicle);

        Vehicle result = vehicleService.create(testVehicle);

        assertNotNull(result);
        assertEquals("VEH001", result.getId());
        assertEquals("Vehicle 01", result.getName());
        verify(vehicleRepository, times(1)).save(testVehicle);
    }

    @Test
    void testCreateVehicleWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleService.create(null));
        verify(vehicleRepository, never()).save(any());
    }

    @Test
    void testReadVehicleSuccess() {
        when(vehicleRepository.findById("VEH001")).thenReturn(Optional.of(testVehicle));

        Vehicle result = vehicleService.read("VEH001");

        assertNotNull(result);
        assertEquals("VEH001", result.getId());
        verify(vehicleRepository, times(1)).findById("VEH001");
    }

    @Test
    void testReadVehicleNotFound() {
        when(vehicleRepository.findById("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class, 
                () -> vehicleService.read("INVALID"));
    }

    @Test
    void testReadVehicleWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleService.read(null));
        verify(vehicleRepository, never()).findById(anyString());
    }

    @Test
    void testUpdateVehicleSuccess() {
        when(vehicleRepository.save(any(Vehicle.class))).thenReturn(testVehicle);

        Vehicle result = vehicleService.update(testVehicle);

        assertNotNull(result);
        verify(vehicleRepository, times(1)).save(testVehicle);
    }

    @Test
    void testUpdateVehicleWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleService.update(null));
        verify(vehicleRepository, never()).save(any());
    }

    @Test
    void testDeleteVehicleSuccess() {
        vehicleService.delete("VEH001");
        verify(vehicleRepository, times(1)).deleteById("VEH001");
    }

    @Test
    void testDeleteVehicleWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vehicleService.delete(null));
        verify(vehicleRepository, never()).deleteById(anyString());
    }

    @Test
    void testGetAllVehicles() {
        List<Vehicle> vehicles = Arrays.asList(testVehicle);
        when(vehicleRepository.findAll()).thenReturn(vehicles);

        List<Vehicle> result = vehicleService.getAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(vehicleRepository, times(1)).findAll();
    }

    @Test
    void testRetrieveByDescSuccess() {
        when(vehicleRepository.findByTypeVehicle("Bus")).thenReturn(Optional.of(testVehicle));

        Vehicle result = vehicleService.retrieveByDesc("Bus");

        assertNotNull(result);
        assertEquals("VEH001", result.getId());
        assertEquals("Bus", result.getTypeVehicle());
        verify(vehicleRepository, times(1)).findByTypeVehicle("Bus");
    }

    @Test
    void testRetrieveByDescNotFound() {
        when(vehicleRepository.findByTypeVehicle("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class,
                () -> vehicleService.retrieveByDesc("INVALID"));
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