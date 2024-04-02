package microserviciosHospital.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import microserviciosHospital.Entity.Condicion;
import microserviciosHospital.Entity.Distrito;
import microserviciosHospital.Entity.Gerente;
import microserviciosHospital.Entity.Sede;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HospitalDto {
    private Long idHospital;
    private String nombre;
    private Integer antiguedad;
    private Float area;
    private Sede sede;
    private Gerente gerente;
    private Condicion condicion;
    private Date date;
}
