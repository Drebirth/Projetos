package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String classe;

    private String nomeFamilia;

    private Integer drop;

    private String pergaminho;

    private String agris;


    public Grind() {
    }

    public Grind(Long id, String classe, String nomeFamilia, Integer drop, String pergaminho, String agris) {
        this.id = id;
        this.classe = classe;
        this.nomeFamilia = nomeFamilia;
        this.drop = drop;
        this.pergaminho = pergaminho;
        this.agris = agris;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public Integer getDrop() {
        return drop;
    }

    public void setDrop(Integer drop) {
        this.drop = drop;
    }

    public String getPergaminho() {
        return pergaminho;
    }

    public void setPergaminho(String pergaminho) {
        this.pergaminho = pergaminho;
    }

    public String getAgris() {
        return agris;
    }

    public void setAgris(String agris) {
        this.agris = agris;
    }
}
