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
@Table(name = "Provincia")
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDistrito")
   Long idProvincia;
    @NotEmpty
    @Column(name = "descDistrito" ,length = 255)
   String descProvincia;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;

}
