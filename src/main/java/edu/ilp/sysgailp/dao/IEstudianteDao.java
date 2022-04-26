package edu.ilp.sysgailp.dao;

import edu.ilp.sysgailp.entity.Estudiante;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    Estudiante findByCodigoEstudiante(Long codigo);
}
