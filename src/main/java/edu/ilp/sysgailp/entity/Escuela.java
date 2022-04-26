package edu.ilp.sysgailp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "escuela")
public class Escuela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idescuela;
    @Column(name = "denominacion",length =50 )
    private String denominacion;
    @Column(name = "codigo_escuela",length =10 )
    private String codigoEscuela;

    @OneToMany(mappedBy = "escuela")
    private List<Estudiante> estudiantes;


    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(String codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

    public Escuela() {
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public Escuela(Long idescuela, String denominacion, String codigoEscuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoEscuela = codigoEscuela;
    }
}
