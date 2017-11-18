package com.example.jcwieczorek.mecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Pedido;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class AdapterListagemPedidos extends RecyclerView.Adapter<HolderListagemPedidos> implements View.OnClickListener, IItemClickListener{

    private List<Pedido> pedidos;
    private Context contexto;

    public AdapterListagemPedidos(List<Pedido> pedidos, Context contexto) {
        this.pedidos = pedidos;
        this.contexto = contexto;
    }


    @Override
    public HolderListagemPedidos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.componente_listagem_pedido, parent, false);
        HolderListagemPedidos holderListagemPedidos = new HolderListagemPedidos(view);

        return holderListagemPedidos;
    }

    @Override
    public void onBindViewHolder(HolderListagemPedidos holder, int position) {

        Pedido pedido = pedidos.get(position);

       //TODO holder.imagem.setImageDrawable();
        holder.pedido.setText(pedido.getId().toString());
        holder.dataEntrega.setText(pedido.getDataEntrega().toString());
        holder.situacao.setText(pedido.getSituacao().toString());
        holder.valorTotal.setText(pedido.getValorTotal().toString());
        holder.setClickListener(this);

    }

    @Override
    public int getItemCount() {
        return pedidos.size();
    }

    @Override
    public void onClick(View v) {

        // TODO funcao botao adicionar

    }

    @Override
    public void onClick(View view, Integer position) {

      //  Pedido pedido = this.pedidos.get(position);
      //  Intent intent = new Intent(contexto, ActivityPedidoDetalhes.class);
      //  intent.putExtra(ActivityPedidoDetalhes.ID, pedido);

       // contexto.startActivity(intent);
    }
}
