package com.example.jcwieczorek.mecommerce.views;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jcwieczorek.mecommerce.R;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class ActivityMain extends ActivityAbstract implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBar actionBar;
    private Button buttonCompra;
    private TextView textView;



    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupView() {

        inicializarComponentes();
        inicializarToolbar();
        definirTelaInicial();

    }

    private void definirTelaInicial() {

        trocarFragment(new FragmentListagemProdutos());
        textView.setText("Produtos");

    }

    private void inicializarComponentes() {
        toolbar = (Toolbar)findViewById(R.id.activity_main_toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.activity_main_drawerLayout);
        navigationView = (NavigationView)findViewById(R.id.activity_main_navigationView);
        buttonCompra = (Button)findViewById(R.id.activity_main_botaoCompra);
        textView = (TextView)findViewById(R.id.activity_main_titulo);
    }

    private void inicializarToolbar() {

        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();

        // habilitar botao menu lateral
        actionBar.setDisplayHomeAsUpEnabled(true);
        // Icone menu
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_36dp);
        // Titulo Menu
        actionBar.setDisplayShowTitleEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        // this - acao metodo abaixo
        buttonCompra.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // abertura botao menu
        if (item.getItemId() == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;


        switch (item.getItemId()){
            case R.id.menu_inicial:
                fragment = new FragmentListagemProdutos();
                textView.setText("Produtos");
                break;

            case R.id.menu_pedido:
                fragment = new FragmentListagemPedidos();
                textView.setText("Pedidos");
                break;

            case R.id.menu_usuario:
                fragment = new FragmentListagemUsuarios();
                textView.setText("Usuarios");
                break;

            case R.id.menu_carrinho:
                fragment = new FragmentListagemCarrinho();
                textView.setText("Carrinho");
                break;


            case R.id.menu_endereco:
                fragment = new FragmentListagemEnderecos();
                textView.setText("Enderecos");
                break;


            case R.id.menu_sair:
                this.finish();

        }

        if (fragment != null){
            trocarFragment(fragment);
            return true;
        }


        return false;
    }

    private void trocarFragment (Fragment fragment){
        drawerLayout.closeDrawers();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.activity_main_tela, fragment);

        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {

    }
}
