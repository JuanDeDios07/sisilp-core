package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "asministrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Administrativo extends Persona{
    @Column(name = "codigo",length = 10,nullable = false)
    private String codigo;
    @Column(name = "cargo",length = 100,nullable = false)
    private String cargo;

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String cargo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Administrativo(String codigo, String cargo) {
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, String codigo, String cargo) {
        super(idpersona);
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }

    public Administrativo() {
    }

    public Administrativo(Long idpersona) {
        super(idpersona);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
