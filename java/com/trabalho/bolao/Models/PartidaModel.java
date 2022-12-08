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

/**
 *
 * @author Gabriel
 */
@Entity
public class PartidaModel {
    
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPartida;
    
    @Column
    private int idPrimeiroTime;
    
    @Column
    private int idSegundoTime;
    
    @Column
    private String data;
    
    @Column
    private int placarPrimeiroTime;
    
    @Column
    private int placarSegundoTime;

    public PartidaModel() {
    }

    public PartidaModel(String data, int placarPrimeiroTime, int placarSegundoTime) {
        this.data = data;
        this.placarPrimeiroTime = placarPrimeiroTime;
        this.placarSegundoTime = placarSegundoTime;
    }

    public long getId() {
        return idPartida;
    }

    public int getIdPrimeiroTime() {
        return idPrimeiroTime;
    }

    public void setIdPrimeiroTime(int idPrimeiroTime) {
        this.idPrimeiroTime = idPrimeiroTime;
    }

    public int getIdSegundoTime() {
        return idSegundoTime;
    }

    public void setIdSegundoTime(int idSegundoTime) {
        this.idSegundoTime = idSegundoTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPlacarPrimeiroTime() {
        return placarPrimeiroTime;
    }

    public void setPlacarPrimeiroTime(int placarPrimeiroTime) {
        this.placarPrimeiroTime = placarPrimeiroTime;
    }

    public int getPlacarSegundoTime() {
        return placarSegundoTime;
    }

    public void setPlacarSegundoTime(int placarSegundoTime) {
        this.placarSegundoTime = placarSegundoTime;
    }
    
    
}
