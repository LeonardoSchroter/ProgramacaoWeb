package com.example.SpringJPA.Controller;


import com.example.SpringJPA.Repository.RepositorioFuncionario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
        "funcionarios"
)
public class FuncionarioController {

    private RepositorioFuncionario repositorioFuncionario;



}
