package edu.ilp.sysgailp.controller;

import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.service.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruevaController {
    @Autowired
    private IEscuelaService escuelaService;
    @GetMapping("/listaEscuelas")
    public List<Escuela> listaEscuelas(){
        return this.escuelaService.listarEscuelas();
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
