package com.example.SpringJPA.Repository;

import com.example.SpringJPA.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Integer> {
}
