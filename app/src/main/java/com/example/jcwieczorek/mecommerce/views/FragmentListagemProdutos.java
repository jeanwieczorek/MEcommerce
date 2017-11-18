package com.example.jcwieczorek.mecommerce.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.jcwieczorek.mecommerce.Models.Produto;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.adapters.AdapterListagemProdutos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class FragmentListagemProdutos extends Fragment {

    private RecyclerView recyclerView;
    private AdapterListagemProdutos adapterListagemProdutos;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inicializacao tela

        View view = inflater.inflate(R.layout.listagem_produtos, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.listagem_produtos_recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // Visualizacao da lista na tela
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV Led 32 polegadas", 999F));
        produtos.add(new Produto("Camera Fotografica", 2000F));
        produtos.add(new Produto("Playstation 4", 2199F));
        produtos.add(new Produto("Notebook LG i5", 1899F));
        produtos.add(new Produto("Mouse Logitech", 89.56F));

        this.adapterListagemProdutos = new AdapterListagemProdutos(produtos, getActivity());

        this.recyclerView.setAdapter(this.adapterListagemProdutos);

        super.onActivityCreated(savedInstanceState);
    }
}
