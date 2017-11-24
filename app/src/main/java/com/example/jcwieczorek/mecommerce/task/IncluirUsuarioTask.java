package com.example.jcwieczorek.mecommerce.task;

import android.os.AsyncTask;

import com.example.jcwieczorek.mecommerce.Models.ResponseStatus;
import com.example.jcwieczorek.mecommerce.Models.Resposta;
import com.example.jcwieczorek.mecommerce.Models.Usuario;
import com.example.jcwieczorek.mecommerce.service.UsuarioService;
import com.example.jcwieczorek.mecommerce.util.ServerCommunicationUtil;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by jcwieczorek on 23/11/2017.
 */

public class IncluirUsuarioTask extends AsyncTask<Usuario, Void, Resposta<String>> {

    private IncluirUsuarioDelegate delegate;
    private UsuarioService usuarioService;

    public IncluirUsuarioTask(IncluirUsuarioDelegate delegate){
        this.usuarioService = ServerCommunicationUtil.getInstance()
                .getRetrofit()
                .create(UsuarioService.class);

        this.delegate = delegate;
    }

    @Override
    protected Resposta<String> doInBackground(Usuario... parameters) {

        Call<Resposta<String>> call = usuarioService.salvarUsuario(parameters[0]);
        try {
            Response<Resposta<String>> response = call.execute();
            return response.body();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Resposta<String> resposta) {
        if(resposta.getStatus() == ResponseStatus.SUCCESS){
            delegate.incluirUsarioSucesso(resposta.getData());
        } else {
            delegate.incluirUsuarioFalha(resposta.getMessage());
        }
    }

    public interface IncluirUsuarioDelegate {
        public void incluirUsarioSucesso(String token);
        public void incluirUsuarioFalha(String mensagem);
    }
}

