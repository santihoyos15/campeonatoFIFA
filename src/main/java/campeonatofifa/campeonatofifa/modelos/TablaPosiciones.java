package campeonatofifa.campeonatofifa.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TablaPosiciones {
    @Id
    private Long id;
    private String pais;
    private Long PJ;
    private Long PG;
    private Long PE;
    private Long PP;
    private Long GF;
    private Long GC;
    private Long Puntos;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getPJ() {
        return PJ;
    }

    public void setPJ(Long PJ) {
        this.PJ = PJ;
    }

    public Long getPG() {
        return PG;
    }

    public void setPG(Long PG) {
        this.PG = PG;
    }

    public Long getPE() {
        return PE;
    }

    public void setPE(Long PE) {
        this.PE = PE;
    }

    public Long getPP() {
        return PP;
    }

    public void setPP(Long PP) {
        this.PP = PP;
    }

    public Long getGF() {
        return GF;
    }

    public void setGF(Long GF) {
        this.GF = GF;
    }

    public Long getGC() {
        return GC;
    }

    public void setGC(Long GC) {
        this.GC = GC;
    }

    public Long getPuntos() {
        return Puntos;
    }

    public void setPuntos(Long puntos) {
        this.Puntos = puntos;
    }

}
