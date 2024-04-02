package microserviciosHospital.Repository;

import microserviciosHospital.Entity.Condicion;
import microserviciosHospital.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionRepository  extends JpaRepository<Condicion,Long>  {

}
