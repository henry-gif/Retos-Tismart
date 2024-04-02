package microserviciosHospital.Service;


import microserviciosHospital.Dto.CondicionDto;
import microserviciosHospital.Entity.Condicion;
import microserviciosHospital.Repository.CondicionRepository;
import microserviciosHospital.Util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Service
public class CondicionServiceImpl implements CondicionService {
    @Autowired
    CondicionRepository condicionRepository;
    @Override
    public List<CondicionDto> listarCondiciones() {

        return null
    }

    @Override
    public CondicionDto registrarCondicion(CondicionDto body) {
        return  null;
    }

    @Override
    public CondicionDto actualizar(CondicionDto body, Long idCondicion) {
      return null;
    }

    @Override
    public String eliminar(Long idCondicion) {
        Optional<Condicion> encontrado = condicionRepository.findById(idCondicion);
        if (encontrado.isPresent()) {
            condicionRepository.deleteById(idCondicion);
            return "Usuario eliminado correctamente";
        }
        return "Usuario no se encuentra registrado";
    }
}
