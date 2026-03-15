package za.ac.cputassignment.service.transport.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cputassignment.Controller.GlobalExceptionHandler;
import za.ac.cputassignment.Repository.transport.VanRepository;
import za.ac.cputassignment.domain.transport.Van;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VanServiceImplTest {

    @Mock
    private VanRepository vanRepository;

    @InjectMocks
    private VanServiceImpl vanService;

    private Van testVan;

    @BeforeEach
    void setUp() {
        testVan = new Van();
        testVan.setId("VAN001");
        testVan.setVanId("VAN001");
        testVan.setName("Van 01");
        testVan.setNumPlate("VAN-2023-01");
    }

    @Test
    void testCreateVanSuccess() {
        when(vanRepository.save(any(Van.class))).thenReturn(testVan);

        Van result = vanService.create(testVan);

        assertNotNull(result);
        assertEquals("VAN001", result.getId());
        assertEquals("Van 01", result.getName());
        verify(vanRepository, times(1)).save(testVan);
    }

    @Test
    void testCreateVanWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vanService.create(null));
        verify(vanRepository, never()).save(any());
    }

    @Test
    void testReadVanSuccess() {
        when(vanRepository.findById("VAN001")).thenReturn(Optional.of(testVan));

        Van result = vanService.read("VAN001");

        assertNotNull(result);
        assertEquals("VAN001", result.getId());
        verify(vanRepository, times(1)).findById("VAN001");
    }

    @Test
    void testReadVanNotFound() {
        when(vanRepository.findById("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class, 
                () -> vanService.read("INVALID"));
    }

    @Test
    void testReadVanWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vanService.read(null));
        verify(vanRepository, never()).findById(anyString());
    }

    @Test
    void testUpdateVanSuccess() {
        when(vanRepository.save(any(Van.class))).thenReturn(testVan);

        Van result = vanService.update(testVan);

        assertNotNull(result);
        verify(vanRepository, times(1)).save(testVan);
    }

    @Test
    void testUpdateVanWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vanService.update(null));
        verify(vanRepository, never()).save(any());
    }

    @Test
    void testDeleteVanSuccess() {
        vanService.delete("VAN001");
        verify(vanRepository, times(1)).deleteById("VAN001");
    }

    @Test
    void testDeleteVanWithNullIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> vanService.delete(null));
        verify(vanRepository, never()).deleteById(anyString());
    }

    @Test
    void testGetAllVans() {
        List<Van> vans = Arrays.asList(testVan);
        when(vanRepository.findAll()).thenReturn(vans);

        List<Van> result = vanService.getAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(vanRepository, times(1)).findAll();
    }

    @Test
    void testRetrieveByDescSuccess() {
        when(vanRepository.findByNumPlate("VAN-2023-01")).thenReturn(Optional.of(testVan));

        Van result = vanService.retrieveByDesc("VAN-2023-01");

        assertNotNull(result);
        assertEquals("VAN001", result.getId());
        assertEquals("VAN-2023-01", result.getNumPlate());
        verify(vanRepository, times(1)).findByNumPlate("VAN-2023-01");
    }

    @Test
    void testRetrieveByDescNotFound() {
        when(vanRepository.findByNumPlate("INVALID")).thenReturn(Optional.empty());

        assertThrows(GlobalExceptionHandler.ResourceNotFoundException.class,
                () -> vanService.retrieveByDesc("INVALID"));
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