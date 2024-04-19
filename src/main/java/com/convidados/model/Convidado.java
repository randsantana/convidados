package com.convidados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    //serialVersionUID esta relacionado a interface Serializable
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private int quantidadeAcompanhate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAcompanhate() {
        return quantidadeAcompanhate;
    }

    public void setQuantidadeAcompanhate(int quantidadeAcompanhate) {
        this.quantidadeAcompanhate = quantidadeAcompanhate;
    }
}
