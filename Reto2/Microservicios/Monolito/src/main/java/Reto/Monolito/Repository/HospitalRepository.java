package Reto.Monolito.Repository;


import Reto.Monolito.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {



//    @Query("SELECT * FROM Hospital h WHERE h.sede = :idSede")
//    List<Hospital> buscarPorIdSede(Long idSede);

//    @Query(value = "SELECT h.* FROM Hospital h INNER JOIN Sede s ON h.sede_id = s.id WHERE s.id = :idSede", nativeQuery = true)
//    List<Hospital> buscarPorIdSede(Long idSede);
}
