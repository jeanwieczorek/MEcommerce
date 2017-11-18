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

public class HolderListagemUsuarios extends RecyclerView.ViewHolder implements View.OnClickListener {

    final TextView nome;
    final TextView cpf;
    final TextView email;
    private IItemClickListener clickListener;


    public HolderListagemUsuarios(View itemView) {
        super(itemView);
        this.nome = (TextView) itemView.findViewById(R.id.componente_listagem_usuario_nome);
        this.cpf = (TextView) itemView.findViewById(R.id.componente_listagem_usuario_cpf);
        this.email = (TextView) itemView.findViewById(R.id.componente_listagem_usuario_email);
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
