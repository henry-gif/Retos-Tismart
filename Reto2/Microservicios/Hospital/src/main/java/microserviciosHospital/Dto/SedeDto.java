package microserviciosHospital.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SedeDto {
    Long idSede;
    String descSede;
    Date FechaRegistro;
}
