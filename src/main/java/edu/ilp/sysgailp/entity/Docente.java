package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Docente extends Persona {
    @Column(name = "iddocente",length = 10,nullable = false)
    private Long iddocente;
    @Column(name = "cursos",length = 100,nullable = false)
    private String cursos;

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, Long iddocente, String cursos) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.iddocente = iddocente;
        this.cursos = cursos;
    }

    public Docente(Long iddocente, String cursos) {
        this.iddocente = iddocente;
        this.cursos = cursos;
    }

    public Docente(Long idpersona, Long iddocente, String cursos) {
        super(idpersona);
        this.iddocente = iddocente;
        this.cursos = cursos;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }

    public Docente() {
    }

    public Docente(Long idpersona) {
        super(idpersona);
    }

    public Long getIddocente() {
        return iddocente;
    }

    public void setIddocente(Long iddocente) {
        this.iddocente = iddocente;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
