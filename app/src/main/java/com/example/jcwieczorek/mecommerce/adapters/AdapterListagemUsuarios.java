package com.example.jcwieczorek.mecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Usuario;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.interfaces.IItemClickListener;

import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class AdapterListagemUsuarios extends RecyclerView.Adapter<HolderListagemUsuarios> implements View.OnClickListener, IItemClickListener{

    private List<Usuario> usuarios;
    private Context contexto;

    public AdapterListagemUsuarios(List<Usuario> usuarios, Context contexto) {
        this.usuarios = usuarios;
        this.contexto = contexto;
    }


    @Override
    public HolderListagemUsuarios onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.componente_listagem_usuario, parent, false);
        HolderListagemUsuarios holderListagemUsuarios = new HolderListagemUsuarios(view);

        return holderListagemUsuarios;
    }

    @Override
    public void onBindViewHolder(HolderListagemUsuarios holder, int position) {

        Usuario usuario = usuarios.get(position);

        //TODO holder.imagem.setImageDrawable();
        holder.nome.setText(usuario.getNome().toString());
        holder.cpf.setText(usuario.getCpf().toString());
        holder.email.setText(usuario.getEmail().toString());
        holder.setClickListener(this);

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    @Override
    public void onClick(View v) {

        // TODO funcao botao adicionar

    }

    @Override
    public void onClick(View view, Integer position) {

        //  Usuario usuario = this.usuarios.get(position);
        //  Intent intent = new Intent(contexto, ActivityUsuarioDetalhes.class);
        //  intent.putExtra(ActivityUsuarioDetalhes.ID, usuario);

        // contexto.startActivity(intent);
    }
}
