package com.example.jcwieczorek.mecommerce.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by jcwieczorek on 08/11/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pedido implements Serializable{

  /*  	"idEnderecoUsuario":1,
                "cartaoCredito":"123456789",
                "validadeCartaoCredito":"1023",
                "codigoSeguranca":"123",
                "produtos" : [2]

*/
    @JsonProperty("title")
    private UUID id;

    @JsonProperty("title")
    private String dataEntrega;

    @JsonProperty("title")
    private String situacao;

    @JsonProperty("title")
    private Float valorTotal;


    public Pedido(String dataEntrega, String situacao, Float valorTotal) {
        this.id = UUID.randomUUID();
        this.dataEntrega = dataEntrega;
        this.situacao = situacao;
        this.valorTotal = valorTotal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

}
