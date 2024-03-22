package com.example.SpringJPA.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Departamento {

    @Id
    @Column(name = "Dnumero")
    private  int dNumero;

    @Column(name = "Dnome")
    private String dNome;

    @OneToOne
    private Funcionario gerente;

    @Column(name = "Data_inicio_gerente")
    private String data_inicio_gerente;

    @OneToMany(mappedBy = "dnr")
    private List<Funcionario> funcionarios;

    @OneToMany(mappedBy = "dNum")
    private List<Projeto> projetos;

    @ElementCollection
    private List<String> localizacoes;


}
