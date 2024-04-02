package Reto.Monolito.Controller;

import Reto.Monolito.Dto.ProvinciaDto;
import Reto.Monolito.Service.DistritoService;
import Reto.Monolito.Service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Distrito")
public class DistritoController {
    @Autowired
    DistritoService distritoService;
    @GetMapping("/Listar")
    public List<ProvinciaDto> listarProvincia(){

        return  null;
    }
    @PostMapping("/registrar")
    public ProvinciaDto registrarDistrito(@RequestBody ProvinciaDto body) {
        return null;
    }

    @PutMapping("/actualizar/{id}")
    public ProvinciaDto actualizar(@RequestBody ProvinciaDto body, @PathVariable("id") Long idDistrito) {
        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idDistrito) {
        return null;
    }
}

