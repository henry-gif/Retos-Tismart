package microserviciosHospital.Entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import java.util.Date;

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

    @NotEmpty
    @Column(name = "nombre" ,length = 255)
    private String nombre;
    @NotEmpty
    @Column(name = "Antiguedad")
    private Integer antiguedad;
    @NotEmpty
    @Column(name = "Area")
    private Float area;
    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "idSede")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "idGerente")
    private Gerente gerente;

    @ManyToOne
    @JoinColumn(name = "idCondicion")
    private Condicion condicion;
    @Column(name = "Fecha creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


}
