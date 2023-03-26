/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercadoonline.model;

import java.io.InputStream;

/**
 *
 * @author Usuário
 */
public class Mercadoria {
    
    private Integer idMercadoria;
    private String nomeMercadoria;
    private Double precoMercadoria;
    private String tipoMercadoria;
    private InputStream fotoMercadoria;
    private int fileItem;

    public Mercadoria() {
    }

    public Mercadoria(Integer idMercadoria, String nomeMercadoria, Double precoMercadoria, String tipoMercadoria, InputStream fotoMercadoria, int fileItem) {
        this.idMercadoria = idMercadoria;
        this.nomeMercadoria = nomeMercadoria;
        this.precoMercadoria = precoMercadoria;
        this.tipoMercadoria = tipoMercadoria;
        this.fotoMercadoria = fotoMercadoria;
        this.fileItem = fileItem;
    }

    public Integer getIdMercadoria() {
        return idMercadoria;
    }

    public void setIdMercadoria(Integer idMercadoria) {
        this.idMercadoria = idMercadoria;
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    public Double getPrecoMercadoria() {
        return precoMercadoria;
    }

    public void setPrecoMercadoria(Double precoMercadoria) {
        this.precoMercadoria = precoMercadoria;
    }

    public String getTipoMercadoria() {
        return tipoMercadoria;
    }

    public void setTipoMercadoria(String tipoMercadoria) {
        this.tipoMercadoria = tipoMercadoria;
    }

    public InputStream getFotoMercadoria() {
        return fotoMercadoria;
    }

    public void setFotoMercadoria(InputStream fotoMercadoria) {
        this.fotoMercadoria = fotoMercadoria;
    }

    public int getFileItem() {
        return fileItem;
    }

    public void setFileItem(int fileItem) {
        this.fileItem = fileItem;
    }
    
    
    
}
