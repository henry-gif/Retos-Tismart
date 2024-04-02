package microserviciosHospital.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import microserviciosHospital.Entity.Provincia;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistritoDto {
    Long idDistrito;
    String descDistrito;
    Date FechaRegistro;
    Provincia provincia;
}
