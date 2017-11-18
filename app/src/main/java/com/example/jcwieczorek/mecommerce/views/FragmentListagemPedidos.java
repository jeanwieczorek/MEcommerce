package com.example.jcwieczorek.mecommerce.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Pedido;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.adapters.AdapterListagemPedidos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class FragmentListagemPedidos extends Fragment {

    private RecyclerView recyclerView;
    private AdapterListagemPedidos adapterListagemPedidos;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inicializacao tela

        View view = inflater.inflate(R.layout.listagem_pedidos, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.listagem_pedidos_recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // Visualizacao da lista na tela
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("12/02/2017","Entregue" , 2500F));
        pedidos.add(new Pedido("15/06/2017","Cancelado" , 500F));
        pedidos.add(new Pedido("12/12/2017","Pendente" , 250.87F));
        pedidos.add(new Pedido("15/12/2017","Pendente" , 3501.4F));

        this.adapterListagemPedidos = new AdapterListagemPedidos(pedidos, getActivity());

        this.recyclerView.setAdapter(this.adapterListagemPedidos);

        super.onActivityCreated(savedInstanceState);
    }
}
