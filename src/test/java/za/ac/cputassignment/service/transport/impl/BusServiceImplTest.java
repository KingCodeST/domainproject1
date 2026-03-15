package za.ac.cputassignment.service.transport.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.Repository.transport.BusRepository;
import za.ac.cputassignment.domain.transport.Bus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BusServiceImplTest {

    @Mock
    private BusRepository busRepository;

    @InjectMocks
    private BusServiceImpl busService;

    private Bus testBus;

    @BeforeEach
    void setUp() {
        testBus = new Bus();
        testBus.setId("BUS001");
        testBus.setBusId("BUS001");
        testBus.setName("Bus 01");
        testBus.setModelNo("MODEL2023");
    }

    @Test
    void testCreateBusSuccess() {
        when(busRepository.save(any(Bus.class))).thenReturn(testBus);

        Bus result = busService.create(testBus);

        assertNotNull(result);
        assertEquals("BUS001", result.getId());
        assertEquals("Bus 01", result.getName());
        verify(busRepository, times(1)).save(testBus);
    }

    @Test
    void testCreateBusWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> busService.create(null));
        verify(busRepository, never()).save(any());
    }

    @Test
    void testReadBusSuccess() {
        when(busRepository.findById("BUS001")).thenReturn(Optional.of(testBus));

        Bus result = busService.read("BUS001");

        assertNotNull(result);
        assertEquals("BUS001", result.getId());
        verify(busRepository, times(1)).findById("BUS001");
    }

    @Test
    void testReadBusNotFound() {
        when(busRepository.findById("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class, 
                () -> busService.read("INVALID"));
    }

    @Test
    void testReadBusWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> busService.read(null));
        verify(busRepository, never()).findById(anyString());
    }

    @Test
    void testUpdateBusSuccess() {
        when(busRepository.save(any(Bus.class))).thenReturn(testBus);

        Bus result = busService.update(testBus);

        assertNotNull(result);
        verify(busRepository, times(1)).save(testBus);
    }

    @Test
    void testUpdateBusWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> busService.update(null));
        verify(busRepository, never()).save(any());
    }

    @Test
    void testDeleteBusSuccess() {
        busService.delete("BUS001");
        verify(busRepository, times(1)).deleteById("BUS001");
    }

    @Test
    void testDeleteBusWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> busService.delete(null));
        verify(busRepository, never()).deleteById(anyString());
    }

    @Test
    void testGetAllBuses() {
        List<Bus> buses = Arrays.asList(testBus);
        when(busRepository.findAll()).thenReturn(buses);

        List<Bus> result = busService.getAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(busRepository, times(1)).findAll();
    }

    @Test
    void testRetrieveByDescSuccess() {
        when(busRepository.findByModelNo("MODEL2023")).thenReturn(Optional.of(testBus));

        Bus result = busService.retrieveByDesc("MODEL2023");

        assertNotNull(result);
        assertEquals("BUS001", result.getId());
        assertEquals("MODEL2023", result.getModelNo());
        verify(busRepository, times(1)).findByModelNo("MODEL2023");
    }

    @Test
    void testRetrieveByDescNotFound() {
        when(busRepository.findByModelNo("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class,
                () -> busService.retrieveByDesc("INVALID"));
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