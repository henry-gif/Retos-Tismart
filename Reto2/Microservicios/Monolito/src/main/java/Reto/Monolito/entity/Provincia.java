package Reto.Monolito.entity;

import javax.persistence.*;

import lombok.*;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "Provincia")
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDistrito")
   Long idProvincia;

    @Column(name = "descDistrito" ,length = 255)
   String descProvincia;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;

}
