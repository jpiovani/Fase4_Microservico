package com.fiap.lavanderia.entity;

import com.fiap.lavanderia.dto.LavanderiaDTO;

import javax.persistence.*;

@Entity
@Table(name = "Tabela_Lavanderia")
public class Lavanderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome_lavanderia")
    private String nomeLavanderia;

    @Column(name = "endereco_lavanderia")
    private String enderecoLavanderia;

    @Column(name = "numero_lavanderia")
    private int numeroLavanderia;

    @Column(name = "bairro_lavanderia")
    private String bairroLavanderia;

    @Column(name = "zona_lavanderia")
    private String zonaLavanderia;

    public Lavanderia(LavanderiaDTO nova) {
        setNomeLavanderia(nova.getNome());
        setBairroLavanderia(nova.getBairro());
        setEnderecoLavanderia(nova.getEndereco());
        setNumeroLavanderia(nova.getNumeroEndereco());
        setZonaLavanderia(nova.getZona());
    }

    public Lavanderia() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLavanderia() {
        return nomeLavanderia;
    }

    public void setNomeLavanderia(String nomeLavanderia) {
        this.nomeLavanderia = nomeLavanderia;
    }

    public String getEnderecoLavanderia() {
        return enderecoLavanderia;
    }

    public void setEnderecoLavanderia(String enderecoLavanderia) {
        this.enderecoLavanderia = enderecoLavanderia;
    }

    public int getNumeroLavanderia() {
        return numeroLavanderia;
    }

    public void setNumeroLavanderia(int numeroLavanderia) {
        this.numeroLavanderia = numeroLavanderia;
    }

    public String getBairroLavanderia() {
        return bairroLavanderia;
    }

    public void setBairroLavanderia(String bairroLavanderia) {
        this.bairroLavanderia = bairroLavanderia;
    }

    public String getZonaLavanderia() {
        return zonaLavanderia;
    }

    public void setZonaLavanderia(String zonaLavanderia) {
        this.zonaLavanderia = zonaLavanderia;
    }
}
