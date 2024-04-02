package microserviciosHospital.Service;

import microserviciosHospital.Dto.GerenteDto;

import java.util.List;

public interface GerenteService {
    List<GerenteDto> listarGerentees();

    GerenteDto registrarGerente(GerenteDto body);

    GerenteDto actualizar(GerenteDto body, Long idGerente);

    String eliminar(Long idGerente);
}
