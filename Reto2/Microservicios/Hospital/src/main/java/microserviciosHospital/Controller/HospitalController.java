package microserviciosHospital.Controller;

import microserviciosHospital.Entity.Hospital;
import microserviciosHospital.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.util.annotation.NonNull;

import java.util.List;
import java.util.Optional;
@RestController
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    // Endpoint para registrar un nuevo hospital
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarHospital(@Validated @RequestBody Hospital hospital) {

            Hospital nuevoHospital = hospitalService.registrarHospital(hospital);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoHospital);

    }

    // Endpoint para modificar un hospital existente
    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> modificarHospital( @Validated@RequestBody Hospital hospital,@PathVariable Long idHospital) {
     Optional<Hospital> O=hospitalService.buscarPorId(idHospital);
     if (O.isEmpty()){
         return ResponseEntity.notFound().build();
     }
     Hospital hospitaldb=O.get();
     hospitaldb.setNombre(hospital.getNombre());
     hospitaldb.setAntiguedad(hospital.getAntiguedad());
     hospitaldb.setArea(hospital.getArea());
     hospitaldb.setDate(hospital.getDate());
     hospitaldb.setIdDistrito(hospital.getIdDistrito());
     hospitaldb.setIdSede(hospital.getIdSede());
     hospital.setIdGerente(hospital.getIdGerente());
     hospitaldb.setIdCondicion(hospital.getIdCondicion());
     return ResponseEntity.status(HttpStatus.CREATED).body(hospitalService.registrarHospital(hospitaldb));
    }

    // Endpoint para eliminar un hospital por su ID
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarHospital(@PathVariable Long idHospital) {
        hospitalService.eliminarHospital(idHospital);
        return ResponseEntity.noContent().build();
    }

    // Endpoint para buscar un hospital por su ID
    @GetMapping("BuscarID/{id}")
    public ResponseEntity<?> buscarHospitalPorId(@PathVariable Long id) {
        Optional<Hospital> o = hospitalService.buscarPorId(id);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    // Endpoint para buscar hospitales por su nombre
    @GetMapping("buscar/{sede}")
    public List<?> buscarHospitalesSede(@RequestParam @NonNull @PathVariable Long idSede) {
        List<Hospital> hospitales = hospitalService.buscarPorSede(idSede);
        if (hospitales.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(hospitales);
    }
}
