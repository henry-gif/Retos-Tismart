package microserviciosHospital.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CondicionDto {
    Long idCondicion;
    String descCondicion;
    Date FechaRegistro;
}
