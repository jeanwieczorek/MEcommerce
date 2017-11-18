package com.example.jcwieczorek.mecommerce.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class Pedido implements Serializable{

    private UUID id;
    private String dataEntrega;
    private String situacao;
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

    public String getDataEntrega() {
        return dataEntrega;
    }

    public String getSituacao() {
        return situacao;
    }

    public Float getValorTotal() {
        return valorTotal;
    }
}
