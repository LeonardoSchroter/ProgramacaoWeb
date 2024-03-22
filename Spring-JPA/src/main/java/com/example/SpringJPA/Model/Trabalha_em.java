package com.example.SpringJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Trabalha_em {

    @Id
    @ManyToOne
    private Funcionario fcpf;

    @Id
    @ManyToOne
    private Projeto pnr;

    private String horas;
}
