package com.example.jcwieczorek.mecommerce.views;

import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.example.jcwieczorek.mecommerce.R;

/**
 * Created by jcwieczorek on 09/11/17.
 */

public class ActivityNovoUsuario extends ActivityAbstract {
    private EditText nome;
    private EditText email;
    private EditText senha;
    private EditText cpf;
    private EditText telefone;
    private RecyclerView listaEnderecos;
    private Button editar;
    private Button salvar;

    @Override
    protected int getLayout() {
        return R.layout.activity_cadastro_usuarios;
    }

    @Override
    protected void setupView() {
        inicializarComponentes();
        configurarTela();
    }

    private void configurarTela() {
        //TODO configuar o resto
    }

    private void inicializarComponentes() {
        this.nome = (EditText) findViewById(R.id.activity_cadastro_usuarios_nome);
        this.email = (EditText) findViewById(R.id.activity_cadastro_usuarios_email);
        this.senha = (EditText) findViewById(R.id.activity_cadastro_usuarios_senha);
        this.cpf = (EditText) findViewById(R.id.activity_cadastro_usuarios_cpf);
        this.telefone = (EditText) findViewById(R.id.activity_cadastro_usuarios_telefone);
        this.listaEnderecos = (RecyclerView) findViewById(R.id.activity_cadastro_usuarios_recViewEndereco);
        this.editar = (Button) findViewById(R.id.activity_cadastro_usuarios_botao_editar);
        this.salvar = (Button) findViewById(R.id.activity_cadastro_usuarios_botao_salvar);
    }
}
