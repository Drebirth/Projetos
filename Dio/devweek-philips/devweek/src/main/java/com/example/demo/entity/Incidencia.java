package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer regiao_id;
    private Integer mes;
    private Long faixa_i;
    private Integer qtd_exames;

    public Incidencia(Integer regiao_id, Integer mes, Long faixa_i, Integer qtd_exames) {
        this.regiao_id = regiao_id;
        this.mes = mes;
        this.faixa_i = faixa_i;
        this.qtd_exames = qtd_exames;
    }

    public Incidencia(){}

    public Long getId(){
        return id;
    }

    public Integer getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(Integer regiao_id) {
        this.regiao_id = regiao_id;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixa_i() {
        return faixa_i;
    }

    public void setFaixa_i(Long faixa_i) {
        this.faixa_i = faixa_i;
    }

    public Integer getQtd_exames() {
        return qtd_exames;
    }

    public void setQtd_exames(Integer qtd_exames) {
        this.qtd_exames = qtd_exames;
    }
}
