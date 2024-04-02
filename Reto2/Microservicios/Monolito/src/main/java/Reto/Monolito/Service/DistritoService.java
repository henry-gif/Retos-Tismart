package Reto.Monolito.Service;



import Reto.Monolito.Dto.DistritoDto;

import java.util.List;

public interface DistritoService {
    List<DistritoDto> listarDistritoes();

    DistritoDto registrarDistrito(DistritoDto body);

    DistritoDto actualizar(DistritoDto body, Long idDistrito);

    String eliminar(Long idDistrito);
}
