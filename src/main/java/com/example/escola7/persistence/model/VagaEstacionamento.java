package com.example.escola7.persistence.model;

import jakarta.persistence.*;

@Entity
public class VagaEstacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public VagaEstacionamento() {
    }

    @ManyToOne
    @JoinColumn(name = "banheiro_id")
    private Banheiro banheiro;

    public VagaEstacionamento(Long id, String nome, Banheiro banheiro) {
        this.id = id;
        this.nome = nome;
        this.banheiro = banheiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banheiro getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(Banheiro banheiro) {
        this.banheiro = banheiro;
    }
}
