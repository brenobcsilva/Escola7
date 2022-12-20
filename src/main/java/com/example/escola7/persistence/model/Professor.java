package com.example.escola7.persistence.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String materia;

    @OneToMany(mappedBy = "professor")
    private List<Aluno> alunos;

    @ManyToOne
    @JoinColumn(name = "banheiro_id", nullable = true)
    private Banheiro banheiro;


    public Professor(Long id, String nome, String materia) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
    }

    public Professor() {
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
