package ranking.model;


import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Dados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String classe;
    private int level;
    private String mapa;
    private int drop;
    private int pa;
    private int dp;

    private String agris;

    private Calendar date;

    @ManyToOne
    @JoinColumn(name = "id_dados")
    private Usuario usuario;

    public Dados(Long id, String nickname, String classe, int level, String mapa, int drop, int pa, int dp, String agris) {
        this.id = id;
        this.nickname = nickname;
        this.classe = classe;
        this.level = level;
        this.mapa = mapa;
        this.drop = drop;
        this.pa = pa;
        this.dp = dp;
    }

    public Dados() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", classe='" + classe + '\'' +
                ", level=" + level +
                ", mapa='" + mapa + '\'' +
                ", drop=" + drop +
                ", pa=" + pa +
                ", dp=" + dp +
                ", agris='" + agris + '\'' +
                ", date=" + date +
                ", usuario=" + usuario +
                '}';
    }
}
