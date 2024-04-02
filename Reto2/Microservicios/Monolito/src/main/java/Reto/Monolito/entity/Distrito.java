package Reto.Monolito.entity;


import lombok.*;

import java.util.Date;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDistrito")
    Long idDistrito;


    @Column(name = "descDistrito" ,length = 255)
    String descDistrito;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaRegistro")

     Date FechaRegistro;
    @ManyToOne
    @JoinColumn(name = "idProvincia")
     Provincia provincia;

}
