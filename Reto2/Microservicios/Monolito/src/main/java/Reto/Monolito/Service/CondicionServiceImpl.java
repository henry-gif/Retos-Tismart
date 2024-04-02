package Reto.Monolito.Service;



import Reto.Monolito.Dto.CondicionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CondicionServiceImpl implements CondicionService {

    @Override
    public List<CondicionDto> listarCondiciones() {
        return null;
    }

    @Override
    public CondicionDto registrarCondicion(CondicionDto body) {
        return null;
    }

    @Override
    public CondicionDto actualizar(CondicionDto body, Long idCondicion) {
        return null;
    }

    @Override
    public String eliminar(Long idCondicion) {
        return null;
    }
}
