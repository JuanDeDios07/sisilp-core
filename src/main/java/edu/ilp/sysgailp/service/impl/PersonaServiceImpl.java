package edu.ilp.sysgailp.service.impl;

import edu.ilp.sysgailp.dao.IPersonaDao;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.service.IPresonaSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPresonaSrevice {
    //inyeccion de dependencia
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona(){

        return  this.personaDao.findAll();
    }

    //obtener persona por dni
    @Override
   public Persona obtenerPersonaPorDNI(String dni){
        return  this.personaDao.findByDniPersona(dni);
    }
}
