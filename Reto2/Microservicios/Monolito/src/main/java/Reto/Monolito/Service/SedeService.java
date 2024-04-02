package Reto.Monolito.Service;



import Reto.Monolito.Dto.SedeDto;

import java.util.List;

public  interface SedeService {
    List<SedeDto> listarSedees();

    SedeDto registrarSede(SedeDto body);

    SedeDto actualizar(SedeDto body, Long idSede);

    String eliminar(Long idSede);
}
