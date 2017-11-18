package com.example.jcwieczorek.mecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Produto;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;
import com.example.jcwieczorek.mecommerce.views.ActivityProdutoDetalhes;

import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class AdapterListagemProdutos extends RecyclerView.Adapter<HolderListagemProdutos> implements View.OnClickListener, IItemClickListener{

    private List<Produto> produtos;
    private Context contexto;

    public AdapterListagemProdutos(List<Produto> produtos, Context contexto) {
        this.produtos = produtos;
        this.contexto = contexto;
    }


    @Override
    public HolderListagemProdutos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.componente_listagem_produto_item, parent, false);
        HolderListagemProdutos holderListagemProdutos = new HolderListagemProdutos(view);

        return holderListagemProdutos;
    }

    @Override
    public void onBindViewHolder(HolderListagemProdutos holder, int position) {

        Produto produto = produtos.get(position);

        //TODO holder.imagem.setImageDrawable();
        holder.nome.setText(produto.getNomeProduto());
        holder.preco.setText(produto.getPrecoProduto().toString());
        holder.setClickListener(this);

    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    @Override
    public void onClick(View v) {

        // TODO funcao botao adicionar

    }

    @Override
    public void onClick(View view, Integer position) {

        Produto produto = this.produtos.get(position);
        Intent intent = new Intent(contexto, ActivityProdutoDetalhes.class);
        intent.putExtra(ActivityProdutoDetalhes.ID, produto);

        contexto.startActivity(intent);
    }
}
