package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String regiao;
    private Long qtd_exames;

    public Regiao(String regiao, Long qtd_exames){}

    public Regiao(){}

    public Long getId(){
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQtd_exames() {
        return qtd_exames;
    }

    public void setQtd_exames(Long qtd_exames) {
        this.qtd_exames = qtd_exames;
    }
}
