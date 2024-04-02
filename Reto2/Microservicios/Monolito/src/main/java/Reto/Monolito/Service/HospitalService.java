package Reto.Monolito.Service;



import Reto.Monolito.Dto.*;
import Reto.Monolito.entity.Hospital;

import java.util.List;

public interface HospitalService {

    Hospital registrarHospital(HospitalDto hospitalDto, CondicionDto condicionDto, SedeDto sedeDto, DistritoDto distritoDto, GerenteDto gerenteDto);
    Hospital modificarHospital(Long idHospital, Hospital hospitalModificado);
    void eliminarHospital(Long idHospital);
    HospitalDto buscarPorId(Long idHospital);
    List<Hospital> buscarPorSede(Long idSede);
    List<HospitalDto> listarHospitales();
}
