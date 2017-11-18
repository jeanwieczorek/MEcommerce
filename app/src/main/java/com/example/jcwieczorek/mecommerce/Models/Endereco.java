package com.example.jcwieczorek.mecommerce.Models;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class Endereco implements Serializable {

    private UUID id;
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;


    public Endereco(String nome, String rua, String bairro, String cidade) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() { return rua; }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

}



