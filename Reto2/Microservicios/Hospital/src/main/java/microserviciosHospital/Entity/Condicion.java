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
@Table(name = "Condiciom")

public class Condicion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCondicion")
    Long idCondicion;

    @NotEmpty
    @Column(name = "descCondicion" ,length = 255)
    String descCondicion;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;


}
