package microserviciosHospital.Service;

import microserviciosHospital.Dto.SedeDto;

import java.util.List;

public  interface SedeService {
    List<SedeDto> listarSedees();

    SedeDto registrarSede(SedeDto body);

    SedeDto actualizar(SedeDto body, Long idSede);

    String eliminar(Long idSede);
}
