package microserviciosHospital.Service;

import microserviciosHospital.Entity.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    Hospital registrarHospital(Hospital hospital);
    Hospital modificarHospital(Long idHospital, Hospital hospitalModificado);
    void eliminarHospital(Long idHospital);
    Optional<Hospital> buscarPorId(Long idHospital);
    List<Hospital> buscarPorSede(Long idSede);
}
