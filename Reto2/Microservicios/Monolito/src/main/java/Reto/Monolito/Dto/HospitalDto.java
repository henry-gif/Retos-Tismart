package Reto.Monolito.Dto;

import Reto.Monolito.entity.Condicion;
import Reto.Monolito.entity.Gerente;
import Reto.Monolito.entity.Sede;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HospitalDto {
    Long idHospital;
    String nombre;
    Integer antiguedad;
    Float area;
    Sede sede;
    Gerente egerente;
    Condicion condicion;
    Date date;
}
