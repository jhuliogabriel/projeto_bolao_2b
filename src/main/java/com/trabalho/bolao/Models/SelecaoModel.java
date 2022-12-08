/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.bolao.Models;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "Selecoes")
public class SelecaoModel {
    
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSelecao;
    
    @Column(nullable = false)
    private String nomeSelecao;
    
    @Column(nullable = false)
    private String nomeAbreviacao;
    
    @Column
    private String nomeTecnico;
    
    public SelecaoModel(){}
    
    public SelecaoModel(String nomeSelecao, String nomeAbreviacao, String nomeTecnico){
        this.nomeSelecao = nomeSelecao;
        this.nomeAbreviacao = nomeAbreviacao;
        this.nomeTecnico = nomeTecnico;
    }
    
    
    public long getId() {
        return idSelecao;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getNomeAbreviacao() {
        return nomeAbreviacao;
    }

    public void setNomeAbreviacao(String nomeAbreviacao) {
        this.nomeAbreviacao = nomeAbreviacao;
    }
    
    
    
}
