package microserviciosHospital.Repository;

import microserviciosHospital.Entity.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente,Long> {
}
