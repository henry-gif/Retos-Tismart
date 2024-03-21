package microserviciosHospital.Repository;

import microserviciosHospital.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {



//    @Query("SELECT * FROM Hospital h WHERE h.sede = :idSede")
//    List<Hospital> buscarPorIdSede(Long idSede);
    @Query(value = "CALL ListarHospitalesPorSede(:idSede)", nativeQuery = true)
    List<Hospital> buscarPorIdSede(Long idSede);
}
