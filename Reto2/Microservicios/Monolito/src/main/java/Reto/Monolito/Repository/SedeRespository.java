package Reto.Monolito.Repository;


import Reto.Monolito.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRespository extends JpaRepository<Sede,Long> {
}
