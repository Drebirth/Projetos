package ranking.model.teste;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class DadosTeste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String classe;
    private int level;
    private String mapa;
    private int drop;
    private int pa;
    private int dp;
    private String agris;
    private Calendar data;

    public DadosTeste(Long id, String usuario, String classe, int level, String mapa, int drop, int pa, int dp, String agris) {
        this.id = id;
        this.usuario = usuario;
        this.classe = classe;
        this.level = level;
        this.mapa = mapa;
        this.drop = drop;
        this.pa = pa;
        this.dp = dp;
        this.agris = agris;
    }

    public DadosTeste() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public String getAgris() {
        return agris;
    }

    public void setAgris(String agris) {
        this.agris = agris;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
