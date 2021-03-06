/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.falae.falaews.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Lucas Pereira
 */
@XmlRootElement
@XmlType(propOrder = {"nomeGrupo", "quantidade"})
public class ReportMensagem {

    private String nomeGrupo;
    private int quantidade;
    
    public ReportMensagem() {   
        nomeGrupo = " ";
        quantidade = 0;
    }
    
    public ReportMensagem(String nomeGrupo, int quantidade) {
        this.nomeGrupo = nomeGrupo;
        this.quantidade = quantidade;        
    }

    @XmlElement
    public String getNomeGrupo() {
        return nomeGrupo;
    }

    @XmlElement
    public int getQuantidade() {
        return quantidade;
    }
    
    public void add() {
        quantidade++;
    }
    
}
