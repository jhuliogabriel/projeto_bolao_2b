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
public class ApostaModel {
    
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAposta;
    
    @Column
    @NotNull
    private int idUsuario;
    
    @Column
    private int idPartida;
    
    @Column
    private int idPrimeiroTime;
    
    @Column
    private int golsPrimeiroTime;
    
    @Column
    private int idSegundoTime;
    
    @Column
    private int golsSegundoTime;

    public ApostaModel() {
    }

    public ApostaModel(int golsPrimeiroTime, int idSegundoTime, int golsSegundoTime) {
        this.golsPrimeiroTime = golsPrimeiroTime;
        this.idSegundoTime = idSegundoTime;
        this.golsSegundoTime = golsSegundoTime;
    }
    
   
    public long getId() {
        return idAposta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPrimeiroTime() {
        return idPrimeiroTime;
    }

    public void setIdPrimeiroTime(int idPrimeiroTime) {
        this.idPrimeiroTime = idPrimeiroTime;
    }

    public int getGolsPrimeiroTime() {
        return golsPrimeiroTime;
    }

    public void setGolsPrimeiroTime(int golsPrimeiroTime) {
        this.golsPrimeiroTime = golsPrimeiroTime;
    }

    public int getIdSegundoTime() {
        return idSegundoTime;
    }

    public void setIdSegundoTime(int idSegundoTime) {
        this.idSegundoTime = idSegundoTime;
    }

    public int getGolsSegundoTime() {
        return golsSegundoTime;
    }

    public void setGolsSegundoTime(int golsSegundoTime) {
        this.golsSegundoTime = golsSegundoTime;
    }
    
    
}
