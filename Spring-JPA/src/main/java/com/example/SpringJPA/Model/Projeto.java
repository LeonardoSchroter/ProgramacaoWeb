package com.example.SpringJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Projeto {
    @Id
    private int Pnumero;

    private String projNome;

    private String projLocal;

    @ManyToOne
    private Departamento dNum;

    @OneToMany(mappedBy = "pnr")
    private List<Trabalha_em> trabalhaEms;

}
