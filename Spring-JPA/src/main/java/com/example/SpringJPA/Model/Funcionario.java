package com.example.SpringJPA.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Funcionario {

    @Id
    @Column(
            nullable = false
    )
    private int cpf;
    @Column(
            nullable = false
    )
    @Embedded
    private Nome nome;

    @Column(
            nullable = false
    )
    private String dataNasc;

    @Column(
            nullable = false
    )
    private double salario;

    @Column(
            nullable = false
    )
    private char sexo;

    @Column(
            nullable = false
    )
    private  String endereco;

    @OneToMany(mappedBy = "funcionario")
    private List<Dependente> dependentes;

    @ManyToOne
    @JoinColumn(name = "Cpf_supervisor")
    private Funcionario supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Funcionario> supervisionados;

    @ManyToOne
    @JoinColumn(name = "dnr")
    private Departamento dnr;

    @OneToMany(mappedBy = "fcpf")
    private List<Trabalha_em> trabalhaEms;

}
