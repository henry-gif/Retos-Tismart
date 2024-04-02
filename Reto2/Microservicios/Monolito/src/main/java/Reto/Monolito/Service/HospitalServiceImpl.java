package Reto.Monolito.Service;


import Reto.Monolito.Dto.*;
import Reto.Monolito.Repository.HospitalRepository;
import Reto.Monolito.Util.Utils;
import Reto.Monolito.entity.Condicion;
import Reto.Monolito.entity.Hospital;
import Reto.Monolito.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements HospitalService{
    HospitalRepository hospitalRepository;

  HospitalDto convertToHospitalDto(Hospital hospital) {
        HospitalDto hospitalDto = new HospitalDto();
        hospitalDto.setIdHospital(hospital.getIdHospital());
        hospitalDto.setNombre(hospital.getNombre());
        hospitalDto.setAntiguedad(hospital.getAntiguedad());
        // Otras conversiones si es necesario

        return hospitalDto;
    }
    @Override
    public Hospital registrarHospital(HospitalDto hospitalDto, CondicionDto condicionDto, SedeDto sedeDto, DistritoDto distritoDto, GerenteDto gerenteDto) {
        Hospital hospital = Utils.toHospital(hospitalDto, new Condicion(), new Sede(), new Distrito(), new Gerente());
        return hospitalRepository.save(hospital);
    }

    @Override
    public Hospital modificarHospital(Long idHospital, Hospital hospitalModificado) {
        return null;
    }

    public HospitalDto modificarHospital(Long id, HospitalDto hospitalDto, CondicionDto condicionDto, SedeDto sedeDto, DistritoDto distritoDto, GerenteDto gerenteDto) {
        Optional<Hospital> hospitalOptional = hospitalRepository.findById(id);
        if (hospitalOptional.isPresent()) {
            Hospital hospital = hospitalOptional.get();

            // Actualizar los campos del hospital con los nuevos valores proporcionados
            hospital.setNombre(hospitalDto.getNombre());
            hospital.setAntiguedad(hospitalDto.getAntiguedad());

            // También puedes actualizar otros campos según sea necesario

            // Convertir DTOs a entidades para aquellos objetos que necesiten actualización
            hospital.setCondicion(Utils.toCondicion(condicionDto));
            hospital.setSede(Utils.toSede(sedeDto));
            hospital.setDistrito(Utils.toDistrito(distritoDto));
            hospital.setGerente(Utils.toGerente(gerenteDto));

            // Guardar los cambios en la base de datos
            hospital = hospitalRepository.save(hospital);

            // Convertir entidad a DTO y devolverlo
            return convertToHospitalDto(hospital);
        }
        return null;
    }

    @Override
    public void eliminarHospital(Long idHospital) {
        hospitalRepository.deleteById(idHospital);
    }

    @Override
    public HospitalDto buscarPorId(Long idHospital) {
        Optional<Hospital> hospitalOptional = hospitalRepository.findById(idHospital);
        if (hospitalOptional.isPresent()) {
            return convertToHospitalDto(hospitalOptional.get());
        }
        return null;
    }

    @Override
    public List<Hospital> buscarPorSede(Long idSede) {
        return null;
    }

    @Override
    public List<HospitalDto> listarHospitales() {
        List<Hospital> hospitales = hospitalRepository.findAll();
        return hospitales.stream()
                .map(this::convertToHospitalDto)
                .collect(Collectors.toList());
    }

}
