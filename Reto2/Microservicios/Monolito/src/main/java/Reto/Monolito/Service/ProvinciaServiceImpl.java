package Reto.Monolito.Service;


import Reto.Monolito.Dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
    @Override
    public List<ProvinciaDto> listarProvinciaes() {
        return null;
    }

    @Override
    public ProvinciaDto registrarProvincia(ProvinciaDto body) {
        return null;
    }

    @Override
    public ProvinciaDto actualizar(ProvinciaDto body, Long idProvincia) {
        return null;
    }

    @Override
    public String eliminar(Long idProvincia) {
        return null;
    }

    @Override
    public HospitalDto modificarHospital(Long id, HospitalDto hospitalDto, CondicionDto condicionDto, SedeDto sedeDto, DistritoDto distritoDto, GerenteDto gerenteDto) {
        return null;
    }
}
