package campeonatofifa.campeonatofifa.servicios;

import campeonatofifa.campeonatofifa.modelos.TablaPosiciones;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoService{

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<TablaPosiciones> getGrupo(Integer grupoId) {
        List<TablaPosiciones> paises = em.createStoredProcedureQuery("fTablaPosicionesGrupo", TablaPosiciones.class)
                .registerStoredProcedureParameter("idGrupoTabla", Integer.class, ParameterMode.IN)
                .setParameter("idGrupoTabla", grupoId)
                .getResultList();

        return paises;
    }
}
