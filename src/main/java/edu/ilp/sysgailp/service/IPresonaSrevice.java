package edu.ilp.sysgailp.service;


import edu.ilp.sysgailp.entity.Persona;

import java.util.List;

public interface IPresonaSrevice {

    //listar todas las escuela
     List<Persona> listarPersona();

// obtener persona por DNI

    Persona obtenerPersonaPorDNI(String dni);

}
