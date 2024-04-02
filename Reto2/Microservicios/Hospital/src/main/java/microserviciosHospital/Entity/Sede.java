package microserviciosHospital.Entity;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.Date;


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

    @NotEmpty
    @Column(name = "descSede" ,length = 255)
    String descSede;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;

}
