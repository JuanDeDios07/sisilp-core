package edu.ilp.sysgailp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona {
    @Column(name = "codigo",length = 10,nullable = false)
    private Long codigo;
    @Column(name = "serie",length = 100,nullable = false)
    private  String serie;

    @ManyToOne
    @JoinColumn(name = "idpersona")
    private Escuela escuela;

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, Long codigo, String serie, Escuela escuela) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(Long codigo, String serie, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona, Long codigo, String serie, Escuela escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona) {
        super(idpersona);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
