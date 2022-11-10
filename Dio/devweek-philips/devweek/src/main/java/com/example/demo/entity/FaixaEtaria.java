package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long faixa_id;
    private Long faixa_n;
    private String descricao;

    public FaixaEtaria(){}

    public FaixaEtaria(Long faixa_id, Long faixa_n, String descricao) {
        this.faixa_id = faixa_id;
        this.faixa_n = faixa_n;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public Long getFaixa_id() {
        return faixa_id;
    }

    public void setFaixa_id(Long faixa_id) {
        this.faixa_id = faixa_id;
    }

    public Long getFaixa_n() {
        return faixa_n;
    }

    public void setFaixa_n(Long faixa_n) {
        this.faixa_n = faixa_n;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
