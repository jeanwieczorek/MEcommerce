package com.example.jcwieczorek.mecommerce.views;

import com.example.jcwieczorek.mecommerce.Models.Produto;
import com.example.jcwieczorek.mecommerce.R;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public class ActivityProdutoDetalhes extends ActivityAbstract {

    public static String ID = "ID";
    private Produto produto;

    @Override
    protected int getLayout() {
        return R.layout.activity_produto_detalhes;
    }

    @Override
    protected void setupView() {

        produto = (Produto)getIntent().getSerializableExtra(ID);

    }
}
