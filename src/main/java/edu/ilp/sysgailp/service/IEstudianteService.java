package edu.ilp.sysgailp.service;

import edu.ilp.sysgailp.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    // LISTAR ESTUDIANTE
    List<Estudiante> listarEstudiante();

    //OBTENER ESTUDIANTE POR CODIGO

    Estudiante obtenerEstudiantePorCodigo(Long codigo);
}
