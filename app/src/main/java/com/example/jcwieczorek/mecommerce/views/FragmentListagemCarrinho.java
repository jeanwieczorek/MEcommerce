package com.example.jcwieczorek.mecommerce.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Carrinho;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.adapters.AdapterListagemCarrinho;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class FragmentListagemCarrinho extends Fragment {

    private RecyclerView recyclerView;
    private AdapterListagemCarrinho adapterListagemCarrinhos;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inicializacao tela

        View view = inflater.inflate(R.layout.listagem_carrinho, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.listagem_carrinho_recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // Visualizacao da lista na tela
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<Carrinho> carrinhos = new ArrayList<>();
        carrinhos.add(new Carrinho("TV Led 32 polegadas", 999F));
        carrinhos.add(new Carrinho("Camera Fotografica", 2000F));

        this.adapterListagemCarrinhos = new AdapterListagemCarrinho(carrinhos, getActivity());

        this.recyclerView.setAdapter(this.adapterListagemCarrinhos);

        super.onActivityCreated(savedInstanceState);

        //Task
        //Retrofit


    }
}
