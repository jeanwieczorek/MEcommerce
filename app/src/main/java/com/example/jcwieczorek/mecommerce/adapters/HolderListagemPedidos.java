package com.example.jcwieczorek.mecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class HolderListagemPedidos extends RecyclerView.ViewHolder implements View.OnClickListener {

    final TextView pedido;
    final TextView dataEntrega;
    final TextView situacao;
    final TextView valorTotal;
    private IItemClickListener clickListener;


    public HolderListagemPedidos(View itemView) {
        super(itemView);
        this.pedido = (TextView) itemView.findViewById(R.id.componente_listagem_pedido_id);
        this.dataEntrega = (TextView) itemView.findViewById(R.id.componente_listagem_pedido_data_entrega);
        this.situacao = (TextView) itemView.findViewById(R.id.componente_listagem_pedido_situacao);
        this.valorTotal = (TextView) itemView.findViewById(R.id.componente_listagem_pedido_valor_total);
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
