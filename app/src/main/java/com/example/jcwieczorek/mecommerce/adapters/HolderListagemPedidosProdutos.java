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

public class HolderListagemPedidosProdutos extends RecyclerView.ViewHolder implements View.OnClickListener {

    final ImageView imagem;
    final TextView nome;
    final TextView preco;
    private IItemClickListener clickListener;


    public HolderListagemPedidosProdutos(View itemView) {
        super(itemView);
        this.imagem = (ImageView) itemView.findViewById(R.id.componente_listagem_produto_item_imagem);
        this.nome = (TextView) itemView.findViewById(R.id.componente_listagem_produto_item_produto);
        this.preco = (TextView) itemView.findViewById(R.id.componente_listagem_produto_item_preco);
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
