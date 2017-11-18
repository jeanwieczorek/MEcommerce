package com.example.jcwieczorek.mecommerce.views;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jcwieczorek on 08/11/17.
 */

public abstract class ActivityAbstract extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        setupView();

    }

    protected abstract int getLayout();

    protected abstract void setupView();

}
