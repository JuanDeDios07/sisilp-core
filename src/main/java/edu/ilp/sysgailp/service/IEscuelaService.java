package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Escuela;

import java.util.List;

public interface IEscuelaService {

    //listar todas las escuelas
    List<Escuela> listarEscuelas();

    //Obtener escuela por su codigo

    Escuela obtenerEscuelaPorCodigo(String codigo);
}
