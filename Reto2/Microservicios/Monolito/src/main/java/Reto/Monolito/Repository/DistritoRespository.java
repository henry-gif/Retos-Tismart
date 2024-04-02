package Reto.Monolito.Repository;


import Reto.Monolito.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRespository extends JpaRepository<Distrito,Long> {
}
