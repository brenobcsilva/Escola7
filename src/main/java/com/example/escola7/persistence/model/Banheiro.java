package com.example.escola7.persistence.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Banheiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;

    @OneToMany(mappedBy = "banheiro")
    private List<Professor> professor;

    @OneToMany(mappedBy = "banheiro")
    private List<Aluno> aluno;

    @OneToMany(mappedBy = "banheiro")
    private List<Coordenador> coordenadors;

    public Banheiro() {
    }

    public Banheiro(Long id, Integer numero, List<Professor> professor, List<Aluno> aluno, List<Coordenador> coordenadors) {
        this.id = id;
        this.numero = numero;
        this.professor = professor;
        this.aluno = aluno;
        this.coordenadors = coordenadors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public List<Coordenador> getCoordenadors() {
        return coordenadors;
    }

    public void setCoordenadors(List<Coordenador> coordenadors) {
        this.coordenadors = coordenadors;
    }
}
