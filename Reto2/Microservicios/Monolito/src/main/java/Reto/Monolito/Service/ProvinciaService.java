package Reto.Monolito.Service;


import Reto.Monolito.Dto.*;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProvinciaService {

    List<ProvinciaDto> listarProvinciaes();

    ProvinciaDto registrarProvincia(ProvinciaDto body);

    ProvinciaDto actualizar(ProvinciaDto body, Long idProvincia);

    String eliminar(Long idProvincia);
    HospitalDto modificarHospital(Long id, HospitalDto hospitalDto, CondicionDto condicionDto, SedeDto sedeDto, DistritoDto distritoDto, GerenteDto gerenteDto);
}
