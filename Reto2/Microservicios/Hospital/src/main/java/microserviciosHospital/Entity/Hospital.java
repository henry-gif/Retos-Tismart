package microserviciosHospital.Entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(name="Hospital")

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
    @NotEmpty
    @Column(name = "idDistrito")
    private Integer idDistrito;
    @NotEmpty
    @Column(name = "idProvincia")
    private Integer idProvincia;

    @Column(name = "idSede")
    private Integer idSede;

    @Column(name = "idGerente")
    private Integer idGerente;

    @Column(name = "idCondiciom")
    private Integer idCondicion;
    @Column(name = "Fecha creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Long getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Long idHospital) {
        this.idHospital = idHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public Integer getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Integer idGerente) {
        this.idGerente = idGerente;
    }

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
