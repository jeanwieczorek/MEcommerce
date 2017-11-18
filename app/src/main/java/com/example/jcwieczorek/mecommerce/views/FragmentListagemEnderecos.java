package com.example.jcwieczorek.mecommerce.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jcwieczorek.mecommerce.Models.Endereco;
import com.example.jcwieczorek.mecommerce.R;
import com.example.jcwieczorek.mecommerce.adapters.AdapterListagemEnderecos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class FragmentListagemEnderecos extends Fragment {

    private RecyclerView recyclerView;
    private AdapterListagemEnderecos adapterListagemEnderecos;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inicializacao tela

        View view = inflater.inflate(R.layout.listagem_enderecos, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.listagem_enderecos_recyclerView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // Visualizacao da lista na tela
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(new Endereco("Casa","Rua São Paulo, 1020" , "Navegantes", "Porto Alegre"));
        enderecos.add(new Endereco("Escritório","Rua Julio de Castilhos, 1100" , "Centro", "Caxias do Sul"));
        enderecos.add(new Endereco("Praia","Rua Golfinhos, 55" , "Marés", "Florianópolis"));

        this.adapterListagemEnderecos = new AdapterListagemEnderecos(enderecos, getActivity());

        this.recyclerView.setAdapter(this.adapterListagemEnderecos);

        super.onActivityCreated(savedInstanceState);
    }
}
