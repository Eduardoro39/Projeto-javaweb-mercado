/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercadoonline.model;

import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author Usuário
 */
public class Usuario extends Pessoa {
    
    private Integer idUsuario;
    private Date dataCadastroUsuario;
    private InputStream fotoUsuario;
    private int fileItem;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, Date dataCadastroUsuario, InputStream fotoUsuario, int fileItem) {
        this.idUsuario = idUsuario;
        this.dataCadastroUsuario = dataCadastroUsuario;
        this.fotoUsuario = fotoUsuario;
        this.fileItem = fileItem;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataCadastroUsuario() {
        return dataCadastroUsuario;
    }

    public void setDataCadastroUsuario(Date dataCadastroUsuario) {
        this.dataCadastroUsuario = dataCadastroUsuario;
    }

    public InputStream getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(InputStream fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public int getFileItem() {
        return fileItem;
    }

    public void setFileItem(int fileItem) {
        this.fileItem = fileItem;
    }
    
}
