package microserviciosHospital.Entity;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.Date;


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

    @NotEmpty
    @Column(name = "descDistrito" ,length = 255)
    String descDistrito;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
     Date FechaRegistro;

    @ManyToOne
    @JoinColumn(name = "idProvincia")
    private Provincia provincia;
}
