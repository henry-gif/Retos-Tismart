package microserviciosHospital.Service;

import microserviciosHospital.Dto.DistritoDto;

import java.util.List;

public interface DistritoService {
    List<DistritoDto> listarDistritoes();

    DistritoDto registrarDistrito(DistritoDto body);

    DistritoDto actualizar(DistritoDto body, Long idDistrito);

    String eliminar(Long idDistrito);
}
