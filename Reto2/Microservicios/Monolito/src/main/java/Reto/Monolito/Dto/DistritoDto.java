package Reto.Monolito.Dto;

import Reto.Monolito.entity.Provincia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
