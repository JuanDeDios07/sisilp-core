package edu.ilp.sysgailp.service.impl;



import edu.ilp.sysgailp.dao.IEstudianteDao;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {
    //inyeccion de dependencia
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiante(){
        return this.estudianteDao.findAll();
    }

    //obtener estudiante por codigo
    public Estudiante obtenerEstudiantePorCodigo(Long codigo){
        return  this.estudianteDao.findByCodigoEstudiante(codigo);
    }
}
