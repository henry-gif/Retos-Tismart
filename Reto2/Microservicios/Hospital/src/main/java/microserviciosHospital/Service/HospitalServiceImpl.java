package microserviciosHospital.Service;

import microserviciosHospital.Entity.Hospital;
import microserviciosHospital.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService{
  @Autowired
  private HospitalRepository hospitalRepository;

    @Override
    @Transactional(readOnly = true)
    public Hospital registrarHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @Override
    @Transactional(readOnly = true)
    public Hospital modificarHospital(Long idHospital, Hospital hospitalModificado) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(idHospital);
        if (optionalHospital.isPresent()) {
            Hospital hospital = optionalHospital.get();
            hospital.setNombre(hospitalModificado.getNombre());
            hospital.setAntiguedad(hospitalModificado.getAntiguedad());
            hospital.setArea(hospitalModificado.getArea());
            hospital.setDate(hospitalModificado.getDate());
            return hospitalRepository.save(hospital);
        } else {
            return null; // Hospital no encontrado
        }
    }

    @Override
    @Transactional
    public void eliminarHospital(Long idHospital) {
        hospitalRepository.deleteById(idHospital);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Hospital> buscarPorId(Long idHospital) {
        return hospitalRepository.findById(idHospital);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Hospital> buscarPorSede(Long idSede) {
        return hospitalRepository.buscarPorIdSede(idSede);
    }


}
