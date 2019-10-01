package za.ac.cputassignment.Repository.transport.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cputassignment.Repository.transport.VehicleRepository;
import za.ac.cputassignment.domain.transport.Vehicle;
import za.ac.cputassignment.factory.transport.VehicleFactory;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleRepositoryImplTest {

    private VehicleRepositoryImpl repository;
    private Vehicle vehicle;

    private Vehicle getSavedVehicle(){
        Set<Vehicle> savedVehicle =this.repository.getAll();
        return savedVehicle.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = VehicleRepositoryImpl.getRepository();
        this.vehicle = VehicleFactory.BuilderGeneric("Masive Four","Camero","#TEF2129df");
    }

    @Test
    public void d_getAll() {
        Set<Vehicle> all = this.repository.getAll();
        System.out.println("In getAll, all = "+all);
    }

    @Test
    public void a_create() {
        Vehicle created = this.repository.create(this.vehicle);
        System.out.println("In Create, created ="+created);
        d_getAll();
        Assert.assertSame(created,this.vehicle);
    }

    @Test
    public void b_read() {
        Vehicle savedArlert = getSavedVehicle();
        System.out.println("In read, arletInfoId ="+savedArlert.getVehicleId());
        Vehicle read =this.repository.read(savedArlert.getVehicleId());
        System.out.println("In read, read = "+read);
        d_getAll();
        Assert.assertEquals(savedArlert,read);

    }

    @Test
    public void c_update() {
        String typeofcar ="Converteble";
        Vehicle arletInfor1=new Vehicle.Builder().copy(getSavedVehicle()).setTypeVehicle(typeofcar).build();
        System.out.println("In update, about_to_updated ="+arletInfor1);
        Vehicle updated  =this.repository.update(arletInfor1);
        System.out.println("In update, updated = "+updated);
        Assert.assertSame(typeofcar,updated.getTypeVehicle());
    }

    @Test
    public void delete() {
        Vehicle savedVehicle =getSavedVehicle();
        this.repository.delete(savedVehicle.getVehicleId());
        d_getAll();

    }
}