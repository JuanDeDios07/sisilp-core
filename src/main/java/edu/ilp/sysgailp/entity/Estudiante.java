package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona {
    @Column(name = "codigo",length = 10,nullable = false)
    private Long codigo;
    @Column(name = "serie",length = 100,nullable = false)
    private  String serie;

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, Long codigo, String serie) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, Long codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }

    public Estudiante() {
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
