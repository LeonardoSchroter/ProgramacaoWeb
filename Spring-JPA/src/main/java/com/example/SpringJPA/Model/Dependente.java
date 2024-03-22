package com.example.SpringJPA.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dependente {
    @Id

    private String nome;

    @Column(nullable = true)
    private char sexo;

    private String dataNasc;

    private String parentesco;

    @ManyToOne
    @Id
    @JoinColumn(nullable = false)
    private Funcionario funcionario;
}
