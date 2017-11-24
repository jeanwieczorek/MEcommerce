package com.example.jcwieczorek.mecommerce.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcwieczorek on 23/11/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Categoria {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
