package microserviciosHospital.Service;

import microserviciosHospital.Dto.ProvinciaDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProvinciaService {

    List<ProvinciaDto> listarProvinciaes();

    ProvinciaDto registrarProvincia(ProvinciaDto body);

    ProvinciaDto actualizar(ProvinciaDto body, Long idProvincia);

    String eliminar(Long idProvincia);
}
