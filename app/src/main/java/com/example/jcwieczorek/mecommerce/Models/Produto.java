package com.example.jcwieczorek.mecommerce.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class Produto implements Serializable{

    @JsonProperty("logradouro")
    private String logradouro;

    private UUID id;
    private String nomeProduto;
    private Float precoProduto;

    public Produto(String nomeProduto, Float precoProduto) {
        this.id = UUID.randomUUID();
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Float getPrecoProduto() {
        return precoProduto;
    }
}
