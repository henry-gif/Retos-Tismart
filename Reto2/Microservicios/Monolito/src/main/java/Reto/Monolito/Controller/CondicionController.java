package Reto.Monolito.Controller;

import Reto.Monolito.Dto.CondicionDto;
import Reto.Monolito.Dto.ProvinciaDto;
import Reto.Monolito.Service.CondicionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/Condicion")
public class CondicionController {
    @Autowired
    CondicionService condicionService;

    @GetMapping("/Listar")
    public List<ProvinciaDto> listar() {
        return null;
    }

    @PostMapping("/registrar")
    public ProvinciaDto registrar(@RequestBody CondicionDto body) {
        return null;
    }

    @PutMapping("/actualizar/{id}")
    public ProvinciaDto actualizar(@RequestBody CondicionDto body, @PathVariable("id") Long idCondicion) {
        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idCondicion) {
        return null;
    }
}

