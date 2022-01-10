package com.fiap.lavanderia.dto;

import com.fiap.lavanderia.entity.Lavanderia;

public class LavanderiaDTO {

    private String nome;
    private String endereco;
    private int numeroEndereco;
    private String bairro;
    private String zona;

    public LavanderiaDTO(){

    }

    public LavanderiaDTO(Lavanderia lavanderia) {
        setNome(lavanderia.getNomeLavanderia());
        setBairro(lavanderia.getBairroLavanderia());
        setEndereco(lavanderia.getEnderecoLavanderia());
        setZona(lavanderia.getZonaLavanderia());
        setNumeroEndereco(lavanderia.getNumeroLavanderia());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
