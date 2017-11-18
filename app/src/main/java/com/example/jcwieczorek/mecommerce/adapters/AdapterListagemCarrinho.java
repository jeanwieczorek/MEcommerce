package com.example.jcwieczorek.mecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jcwieczorek.mecommerce.Models.Carrinho;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class AdapterListagemCarrinho extends RecyclerView.Adapter<HolderListagemCarrinho> implements View.OnClickListener, IItemClickListener{

    private List<Carrinho> carrinhos;
    private Context contexto;

    public AdapterListagemCarrinho(List<Carrinho> carrinhos, Context contexto) {
        this.carrinhos = carrinhos;
        this.contexto = contexto;
    }


    @Override
    public HolderListagemCarrinho onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.componente_listagem_carrinho, parent, false);
        HolderListagemCarrinho holderListagemCarrinho = new HolderListagemCarrinho(view);

        return holderListagemCarrinho;
    }

    @Override
    public void onBindViewHolder(HolderListagemCarrinho holder, int position) {

        Carrinho carrinho = carrinhos.get(position);

        //TODO holder.imagem.setImageDrawable();
        holder.nome.setText(carrinho.getNomeProduto());
        holder.preco.setText(carrinho.getPrecoProduto().toString());
        holder.setClickListener(this);

    }

    @Override
    public int getItemCount() {
        return carrinhos.size();
    }

    @Override
    public void onClick(View v) {

        // TODO funcao botao adicionar

    }

    @Override
    public void onClick(View view, Integer position) {

       // Carrinho carrinho = this.carrinhos.get(position);
      // Intent intent = new Intent(contexto, ActivityCarrinhoDetalhes.class);
      // intent.putExtra(ActivityCarrinhoDetalhes.ID, carrinho);

      // contexto.startActivity(intent);
    }
}
