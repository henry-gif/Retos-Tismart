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
@Table(name = "Gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGerente")
    Long idGerente;

    @NotEmpty
    @Column(name = "descGeremte" ,length = 255)
    String descGeremte;

    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    Date FechaRegistro;


}
