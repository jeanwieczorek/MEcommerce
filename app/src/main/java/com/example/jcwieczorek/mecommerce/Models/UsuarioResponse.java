package com.example.jcwieczorek.mecommerce.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jcwieczorek on 23/11/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioResponse {

    private String cpf;
    private String email;
    private String nome;
    private String senha;
    private String telefone;
    private Long id;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
