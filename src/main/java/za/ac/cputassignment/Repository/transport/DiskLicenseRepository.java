package za.ac.cputassignment.Repository.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.util.Set;

public interface DiskLicenseRepository extends JpaRepository<DiskLicense,String> {

}
