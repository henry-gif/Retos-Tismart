package microserviciosHospital.Repository;

import microserviciosHospital.Entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository  extends JpaRepository<Provincia,Long> {
}
