package edu.ilp.sysgailp.controller;

import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.service.IEscuelaService;
import edu.ilp.sysgailp.service.IEstudianteService;
import edu.ilp.sysgailp.service.IPresonaSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruevaController {
    //LISTAR ESCUELA
    @Autowired
    private IEscuelaService escuelaService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaEscuelas")
    public List<Escuela> listaEscuelas(){
        return this.escuelaService.listarEscuelas();
    }
//LISTAR PERSONA
    @Autowired
    private IPresonaSrevice personaService;
    @GetMapping("/listarPersona")
    public List<Persona> listarPersona(){
        return  this.personaService.listarPersona();
    }
    //LISTAR ESTUDIANTE
    @Autowired
    private IEstudianteService estudianteService;
    @GetMapping("/listarEstudiante")
    public List<Estudiante> listarEstudiante(){
        return this.estudianteService.listarEstudiante();
    }
    // METODO DE BUSCAR ESCUELA
    @GetMapping("/buscarEscuelaByCodigo")
    public Escuela buscarEscuelaByCodigo(@RequestParam String codigo){
        return this.escuelaService.obtenerEscuelaPorCodigo(codigo);

    }
    //BUSCARB ESTUDIANTE

    @GetMapping("/buscarEstudianteByCodigo")
    public  Estudiante buscarEstudianteByCodigo(@RequestParam Long codigo){
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);
    }
    //BUSCAR DNI POR PERSONA
    @GetMapping("/buscarPersonaByDni")
    public  Persona buscarPersonaByDni(@RequestParam String dni){
        return this.personaService.obtenerPersonaPorDNI(dni);
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola amig@s desde ayacucho - Perú ";

    }
    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos){
        return "Bienvenido a la Pontificia :"+datos;
    }
}
