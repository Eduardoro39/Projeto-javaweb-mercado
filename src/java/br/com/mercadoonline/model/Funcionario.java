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
public class Funcionario extends Pessoa {
    
    private Integer idFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
    private String cepFuncionario;
    private Cidade cidade;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario, String telefoneFuncionario, String enderecoFuncionario, String cepFuncionario, Cidade cidade) {
        this.idFuncionario = idFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.cepFuncionario = cepFuncionario;
        this.cidade = cidade;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public String getCepFuncionario() {
        return cepFuncionario;
    }

    public void setCepFuncionario(String cepFuncionario) {
        this.cepFuncionario = cepFuncionario;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
