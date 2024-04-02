package Reto.Monolito.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "Sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSede")
    Long idSede;


    @Column(name = "descSede" ,length = 255)
    String descSede;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;

}
