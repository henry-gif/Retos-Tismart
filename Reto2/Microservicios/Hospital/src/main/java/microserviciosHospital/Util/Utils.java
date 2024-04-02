package microserviciosHospital.Util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import microserviciosHospital.Dto.*;
import microserviciosHospital.Entity.*;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {
    public static Condicion toCondicion(CondicionDto condicionDto) {
        Condicion condicion = new Condicion();
        condicion.setIdCondicion(condicionDto.getIdCondicion());
        condicion.setDescCondicion(condicionDto.getDescCondicion());
        condicion.setFechaRegistro(condicionDto.getFechaRegistro());

        return condicion;
    }
    public static Sede toSede(SedeDto sedeDto) {
        Sede sede = new Sede();
        sede.setIdSede(sedeDto.getIdSede());
        sede.setDescSede(sedeDto.getDescSede());
        sede.setFechaRegistro(sedeDto.getFechaRegistro());

        return sede;
    }

    public static Provincia toProvincia(ProvinciaDto provinciaDto) {
        Provincia provincia = new Provincia();
        provincia.setIdProvincia(provinciaDto.getIdProvincia());
        provincia.setDescProvincia(provinciaDto.getDescProvincia());
        provincia.setFechaRegistro(provinciaDto.getFechaRegistro());

        return provincia;
    }
    public static Distrito toDistrito(DistritoDto distritoDto ) {
        final  Distrito distrito = new Distrito();
        distrito.setIdDistrito(distritoDto.getIdDistrito());
        distrito.setDescDistrito(distritoDto.getDescDistrito());
        distrito.setFechaRegistro(distritoDto.getFechaRegistro());
        distrito.setProvincia(distritoDto.getProvincia());
        return distrito;
    }
    public static Gerente toGerente(GerenteDto GerenteDto) {
        Gerente gerente = new Gerente();
        gerente.setIdGerente(GerenteDto.getIdGerente());
        gerente.setDescGeremte(GerenteDto.getDescGerente());
        gerente.setFechaRegistro(GerenteDto.getFechaRegistro());

        return gerente;
    }
    public static Hospital toHospital(HospitalDto hospitalDto,Condicion condicion,Sede sede,Distrito distrito,) {
        HospitalDto hospital = new HospitalDto();
        hospital.setIdHospital(hospitalDto.getIdHospital());
        hospital.setNombre(hospitalDto.getNombre());
        hospital.setAntiguedad(hospitalDto.getAntiguedad());
        hospital.setArea(hospital.getArea());
        hospital.setCondicion(condicion);
        hospital.setSede(sede);

        return hospitalDto;
    }
}
