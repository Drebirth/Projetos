package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nick;

    @Column(nullable = false)
    private String classe;

    @Column(nullable = false)
    private Integer pa;

    @Column(nullable = false)
    private Integer dp;

    @Column(nullable = false)
    private Integer nivel;

    @Column(nullable = false)
    private String mapa;

    @Column(nullable = false)
    private Boolean agris;

    @Column(nullable = false)
    private Boolean obtencao_um;

    @Column(nullable = false)
    private Boolean obtencao_dois;

    @Column(nullable = false)
    private Float tempo_grind;

    public Dado() {
    }

    public Dado(Long id, String nick, String classe, Integer pa, Integer dp, Integer nivel, String mapa, Boolean agris,
            Boolean obtecencao_um, Boolean obtencao_dois, Float tempo_grind) {
        this.id = id;
        this.nick = nick;
        this.classe = classe;
        this.pa = pa;
        this.dp = dp;
        this.nivel = nivel;
        this.mapa = mapa;
        this.agris = agris;
        this.obtencao_um = obtecencao_um;
        this.obtencao_dois = obtencao_dois;
        this.tempo_grind = tempo_grind;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getPa() {
        return pa;
    }

    public void setPa(Integer pa) {
        this.pa = pa;
    }

    public Integer getDp() {
        return dp;
    }

    public void setDp(Integer dp) {
        this.dp = dp;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public Boolean getAgris() {
        return agris;
    }

    public void setAgris(Boolean agris) {
        this.agris = agris;
    }

    public Boolean getObtencao_um() {
        return obtencao_um;
    }

    public void setObtencao_um(Boolean obtencao_um) {
        this.obtencao_um = obtencao_um;
    }

    public Boolean getObtencao_dois() {
        return obtencao_dois;
    }

    public void setObtencao_dois(Boolean obtencao_dois) {
        this.obtencao_dois = obtencao_dois;
    }

    public Float getTempo_grind() {
        return tempo_grind;
    }

    public void setTempo_grind(Float tempo_grind) {
        this.tempo_grind = tempo_grind;
    }

}
