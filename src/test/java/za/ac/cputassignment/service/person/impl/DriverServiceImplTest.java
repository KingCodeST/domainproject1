package za.ac.cputassignment.service.person.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.Repository.person.DriverRepository;
import za.ac.cputassignment.domain.person.Driver;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DriverServiceImplTest {

    @Mock
    private DriverRepository driverRepository;

    @InjectMocks
    private DriverServiceImpl driverService;

    private Driver testDriver;

    @BeforeEach
    void setUp() {
        testDriver = new Driver();
        testDriver.setId("DRV001");
        testDriver.setDriverID("DRV001");
        testDriver.setName("John Doe");
        testDriver.setLicenseCode("LICENSE123");
    }

    @Test
    void testCreateDriverSuccess() {
        when(driverRepository.save(any(Driver.class))).thenReturn(testDriver);

        Driver result = driverService.create(testDriver);

        assertNotNull(result);
        assertEquals("DRV001", result.getId());
        assertEquals("John Doe", result.getName());
        verify(driverRepository, times(1)).save(testDriver);
    }

    @Test
    void testCreateDriverWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.create(null));
        verify(driverRepository, never()).save(any());
    }

    @Test
    void testReadDriverSuccess() {
        when(driverRepository.findById("DRV001")).thenReturn(Optional.of(testDriver));

        Driver result = driverService.read("DRV001");

        assertNotNull(result);
        assertEquals("DRV001", result.getId());
        verify(driverRepository, times(1)).findById("DRV001");
    }

    @Test
    void testReadDriverNotFound() {
        when(driverRepository.findById("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class, 
                () -> driverService.read("INVALID"));
        verify(driverRepository, times(1)).findById("INVALID");
    }

    @Test
    void testReadDriverWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.read(null));
        verify(driverRepository, never()).findById(anyString());
    }

    @Test
    void testReadDriverWithEmptyIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.read("  "));
        verify(driverRepository, never()).findById(anyString());
    }

    @Test
    void testUpdateDriverSuccess() {
        when(driverRepository.save(any(Driver.class))).thenReturn(testDriver);

        Driver result = driverService.update(testDriver);

        assertNotNull(result);
        verify(driverRepository, times(1)).save(testDriver);
    }

    @Test
    void testUpdateDriverWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.update(null));
        verify(driverRepository, never()).save(any());
    }

    @Test
    void testUpdateDriverWithoutIdThrowsException() {
        Driver driverWithoutId = new Driver();
        driverWithoutId.setId(null);
        
        assertThrows(IllegalArgumentException.class, () -> driverService.update(driverWithoutId));
        verify(driverRepository, never()).save(any());
    }

    @Test
    void testDeleteDriverSuccess() {
        driverService.delete("DRV001");
        verify(driverRepository, times(1)).deleteById("DRV001");
    }

    @Test
    void testDeleteDriverWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.delete(null));
        verify(driverRepository, never()).deleteById(anyString());
    }

    @Test
    void testDeleteDriverWithEmptyIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> driverService.delete("   "));
        verify(driverRepository, never()).deleteById(anyString());
    }

    @Test
    void testGetAllDrivers() {
        List<Driver> drivers = Arrays.asList(testDriver);
        when(driverRepository.findAll()).thenReturn(drivers);

        List<Driver> result = driverService.getAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(driverRepository, times(1)).findAll();
    }

    @Test
    void testRetrieveByDescSuccess() {
        when(driverRepository.findByLicenseCode("LICENSE123")).thenReturn(Optional.of(testDriver));

        Driver result = driverService.retrieveByDesc("LICENSE123");

        assertNotNull(result);
        assertEquals("DRV001", result.getId());
        assertEquals("LICENSE123", result.getLicenseCode());
        verify(driverRepository, times(1)).findByLicenseCode("LICENSE123");
    }

    @Test
    void testRetrieveByDescNotFound() {
        when(driverRepository.findByLicenseCode("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class,
                () -> driverService.retrieveByDesc("INVALID"));
        verify(driverRepository, times(1)).findByLicenseCode("INVALID");
    }
}