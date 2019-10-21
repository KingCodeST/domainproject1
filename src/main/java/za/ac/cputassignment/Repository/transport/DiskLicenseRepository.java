package za.ac.cputassignment.Repository.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cputassignment.Repository.IRepository;
import za.ac.cputassignment.domain.transport.DiskLicense;

import java.util.Set;

@Repository("DiskLicenseRepository")
public interface DiskLicenseRepository extends JpaRepository<DiskLicense,String> {

}
