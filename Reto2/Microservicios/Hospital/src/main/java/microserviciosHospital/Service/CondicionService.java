package microserviciosHospital.Service;

import microserviciosHospital.Dto.CondicionDto;

import java.util.List;

public interface CondicionService {
    List<CondicionDto> listarCondiciones();

    CondicionDto registrarCondicion(CondicionDto body);

    CondicionDto actualizar(CondicionDto body, Long idCondicion);

    String eliminar(Long idCondicion);
}
