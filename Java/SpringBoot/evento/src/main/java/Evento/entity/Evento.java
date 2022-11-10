package Evento.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private  Integer vagas;

    private String dataEHoraDeInicio;

  //  private  String dataEHoraDeFim;

    public Evento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getDataEHoraDeInicio() {
        return dataEHoraDeInicio;
    }

    public void setDataEHoraDeInicio(String dataEHoraDeInicio) {
        this.dataEHoraDeInicio = dataEHoraDeInicio;
    }

    //    public String getDataEHoraDeFim(DateTimeFormatter formatter) {
//        return dataEHoraDeFim;
//    }
//
//    public void setDataEHoraDeFim(String dataEHoraDeFim) {
//        this.dataEHoraDeFim = dataEHoraDeFim;
//    }
}
