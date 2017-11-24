package com.example.jcwieczorek.mecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class HolderListagemEnderecos extends RecyclerView.ViewHolder implements View.OnClickListener {

    final TextView logradouro;
    final TextView numero;
    final TextView complemento;
    final TextView bairro;
    final TextView cidade;
    final TextView estado;
    private IItemClickListener clickListener;


    public HolderListagemEnderecos(View itemView) {
        super(itemView);
        this.logradouro = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_logradouro);
        this.numero = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_numero);
        this.complemento = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_complemento);
        this.bairro = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_bairro);
        this.cidade = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_cidade);
        this.estado = (TextView) itemView.findViewById(R.id.componente_listagem_endereco_estado);
        this.clickListener = clickListener;
        itemView.setOnClickListener(this);
    }

    //Atribui OnClick ao item
    public void setClickListener(IItemClickListener iItemClickListener){

        this.clickListener = iItemClickListener;

    }

    @Override
    public void onClick(View v) {

        clickListener.onClick(v, getAdapterPosition());

    }
}
