package com.example.SpringJPA.Model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nome {

    @Column(name = "Pnome")
    private String pNome;

    @Column(name = "Mnome")

    private String mNome;

    @Column(name = "Unome")

    private String uNome;

}
