package Reto.Monolito.entity;


import lombok.*;

import javax.persistence.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "Gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGerente")
    Long idGerente;


    @Column(name = "descGeremte" ,length = 255)
    String descGeremte;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;


}
