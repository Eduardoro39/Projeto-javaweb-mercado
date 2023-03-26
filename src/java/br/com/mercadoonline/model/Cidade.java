/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercadoonline.model;

/**
 *
 * @author Usuário
 */
public class Cidade {
    
    private Integer idCidade;
    private String nomeCidade;
    private String ufCidade;

    public Cidade() {
    }

    public Cidade(Integer idCidade, String nomeCidade, String ufCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.ufCidade = ufCidade;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }
    
    
    
}
