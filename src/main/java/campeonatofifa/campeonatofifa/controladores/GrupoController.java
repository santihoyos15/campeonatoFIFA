package campeonatofifa.campeonatofifa.controladores;

import campeonatofifa.campeonatofifa.modelos.TablaPosiciones;
import campeonatofifa.campeonatofifa.servicios.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping("/{id}")
    public List<TablaPosiciones> get(@PathVariable Integer id) {
        return grupoService.getGrupo(id);
    }

}

