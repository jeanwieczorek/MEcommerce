package com.example.jcwieczorek.mecommerce.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jcwieczorek.mecommerce.Models.Usuario;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.adapters.AdapterListagemUsuarios;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

//Onclick pra trataor o botão
public class FragmentListagemUsuarios extends Fragment implements View.OnClickListener {

    private RecyclerView recyclerView;
    private AdapterListagemUsuarios adapterListagemUsuarios;

    private Button novoUsuario; //botão novo usuario


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inicializacao tela

        View view = inflater.inflate(R.layout.listagem_usuarios, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.listagem_usuarios_recyclerView);
        novoUsuario = (Button) view.findViewById(R.id.componente_listagem_usuarios_botao_novo_usuario); //pegando a referência

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // Visualizacao da lista na tela
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Antonio da Silva","antonio@gmail.com" , "900.345.120-00"));
        usuarios.add(new Usuario("Pedro Valente","pedrovalente@yahoo.com" , "123.785.170-43"));
        usuarios.add(new Usuario("Marcos Paulo","mpaulo@gmail.com" , "123.345.999-12"));
        usuarios.add(new Usuario("Anita Schmitt","anitas@ftec.acad.br" , "560.445.140-44"));

        this.adapterListagemUsuarios = new AdapterListagemUsuarios(usuarios, getActivity());

        this.recyclerView.setAdapter(this.adapterListagemUsuarios);
        this.novoUsuario.setOnClickListener(this); //setando o listener do botão

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        //switch pra ver qual botão foi clicado
        switch (v.getId()) {
            case R.id.componente_listagem_usuarios_botao_novo_usuario:
                //aqui vai abrir a outra activity

                //o primeiro parametro é a activity q está, o segunda é a que quer abrir
                //como aqui é um fragment, precisa pegar a activity q ta o fragment
                Intent intent = new Intent(getActivity(), ActivityNovoUsuario.class); //activity precisa estar no manifests
                getActivity().startActivity(intent);

                break;
        }
    }
}
