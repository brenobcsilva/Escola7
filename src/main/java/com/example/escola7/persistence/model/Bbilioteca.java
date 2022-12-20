package com.example.escola7.persistence.model;

import jakarta.persistence.*;

@Entity
public class Bbilioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer andar;

    @ManyToOne
    @JoinColumn(name = "banheiro_id")
    private Banheiro banheiro;

    public Bbilioteca() {
    }

    public Bbilioteca(Long id, String nome, Integer andar, Banheiro banheiro) {
        this.id = id;
        this.nome = nome;
        this.andar = andar;
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

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Banheiro getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(Banheiro banheiro) {
        this.banheiro = banheiro;
    }
}
