package Reto.Monolito.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.*;

@Data
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


    @Column(name = "descCondicion" ,length = 255)
    String descCondicion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaRegistro")
    Date FechaRegistro;


}
