package com.example.jcwieczorek.mecommerce.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Endereco;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class AdapterListagemEnderecos extends RecyclerView.Adapter<HolderListagemEnderecos> implements View.OnClickListener, IItemClickListener{

    private List<Endereco> enderecos;
    private Context contexto;

    public AdapterListagemEnderecos(List<Endereco> enderecos, Context contexto) {
        this.enderecos = enderecos;
        this.contexto = contexto;
    }


    @Override
    public HolderListagemEnderecos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.componente_listagem_endereco, parent, false);
        HolderListagemEnderecos holderListagemEnderecos = new HolderListagemEnderecos(view);

        return holderListagemEnderecos;
    }

    @Override
    public void onBindViewHolder(HolderListagemEnderecos holder, int position) {

        Endereco endereco = enderecos.get(position);

        //TODO holder.imagem.setImageDrawable();
        holder.nome.setText(endereco.getNome().toString());
        holder.rua.setText(endereco.getRua().toString());
        holder.bairro.setText(endereco.getBairro().toString());
        holder.cidade.setText(endereco.getCidade().toString());
        holder.setClickListener(this);

    }

    @Override
    public int getItemCount() {
        return enderecos.size();
    }

    @Override
    public void onClick(View v) {

        // TODO funcao botao adicionar

    }

    @Override
    public void onClick(View view, Integer position) {

        //  Endereco endereco = this.enderecos.get(position);
        //  Intent intent = new Intent(contexto, ActivityEnderecoDetalhes.class);
        //  intent.putExtra(ActivityEnderecoDetalhes.ID, endereco);

        // contexto.startActivity(intent);
    }
}
