package Reto.Monolito.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SedeDto {
    Long idSede;
    String descSede;
    Date FechaRegistro;
}
