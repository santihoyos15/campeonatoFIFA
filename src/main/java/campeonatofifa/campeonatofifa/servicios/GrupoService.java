package campeonatofifa.campeonatofifa.servicios;

import campeonatofifa.campeonatofifa.modelos.TablaPosiciones;

import java.util.List;

public interface GrupoService {
    List<TablaPosiciones> getGrupo(Integer grupoId);
}
