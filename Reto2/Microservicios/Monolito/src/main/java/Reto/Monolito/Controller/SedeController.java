package Reto.Monolito.Controller;

import Reto.Monolito.Dto.ProvinciaDto;
import Reto.Monolito.Service.ProvinciaService;
import Reto.Monolito.Service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sede")
public class SedeController {
    @Autowired
    SedeService provinciaService;
    @GetMapping("/Listar")
    public List<ProvinciaDto> listarProvincia(){
        
        return null;
    }
    @PostMapping("/registrar")
    public ProvinciaDto registrarProvincia(@RequestBody ProvinciaDto body) {
       return null;
    }

    @PutMapping("/actualizar/{id}")
    public ProvinciaDto actualizar(@RequestBody ProvinciaDto body, @PathVariable("id") Long idProvincia) {
        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idProvincia) {

        return null;
    }
}

