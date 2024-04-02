package Reto.Monolito.Controller;

import Reto.Monolito.Dto.ProvinciaDto;
import Reto.Monolito.Service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hospital")
public class HospitalController {
    @Autowired
    ProvinciaService provinciaService;
    @GetMapping("/Listar")
    public List<ProvinciaDto> listarProvincia(){
        return  provinciaService.listarProvinciaes();
    }
    @PostMapping("/registrar")
    public ProvinciaDto registrarEmpleado(@RequestBody ProvinciaDto body) {
        return provinciaService.registrarProvincia(body);
    }

    @PutMapping("/actualizar/{id}")
    public ProvinciaDto actualizar(@RequestBody ProvinciaDto body, @PathVariable("id") Long idEmpleado) {
        return provinciaService.actualizar(body, idEmpleado);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long idEmpleado) {
        return provinciaService.eliminar(idEmpleado);
    }
}

