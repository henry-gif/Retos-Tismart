package Reto.Monolito.entity;

import javax.persistence.*;

import lombok.*;

import java.util.Date;
@Data
@Entity
@Table(name="Hospital")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHospital")
    private Long idHospital;


    @Column(name = "nombre" ,length = 255)
    private String nombre;

    @Column(name = "Antiguedad")
    private Integer antiguedad;

    @Column(name = "Area")
    private Float area;
    @OneToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;

    @OneToOne
    @JoinColumn(name = "idSede")
    private Sede sede;

    @OneToOne
    @JoinColumn(name = "idGerente")
    private Gerente gerente;

    @OneToOne
    @JoinColumn(name = "idCondicion")
    private Condicion condicion;
    @Column(name = "Fecha creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


}
