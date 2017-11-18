package com.example.jcwieczorek.mecommerce.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class Usuario implements Serializable {

    private UUID id;
    private String nome;
    private String cpf;
    private String email;


    public Usuario(String nome, String email, String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

}



