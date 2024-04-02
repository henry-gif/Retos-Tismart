package Reto.Monolito.Service;


import Reto.Monolito.Dto.GerenteDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteServiceImpl  implements GerenteService{
    @Override
    public List<GerenteDto> listarGerentees() {
        return null;
    }

    @Override
    public GerenteDto registrarGerente(GerenteDto body) {
        return null;
    }

    @Override
    public GerenteDto actualizar(GerenteDto body, Long idGerente) {
        return null;
    }


    @Override
    public String eliminar(Long idGerente) {
        return null;
    }
}
