package com.example.jcwieczorek.mecommerce.task;

import android.os.AsyncTask;

import com.example.jcwieczorek.mecommerce.Models.Endereco;
import com.example.jcwieczorek.mecommerce.Models.ResponseStatus;
import com.example.jcwieczorek.mecommerce.Models.Resposta;
import com.example.jcwieczorek.mecommerce.service.EnderecoService;
import com.example.jcwieczorek.mecommerce.util.ServerCommunicationUtil;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by jcwieczorek on 23/11/2017.
 */

public class IncluirEnderecoTask extends AsyncTask<Endereco, Void, Resposta<String>> {
    private IncluirEnderecoTask.IncluirEnderecoDelegate delegate;
    private EnderecoService enderecoService;

    public IncluirEnderecoTask(IncluirEnderecoTask.IncluirEnderecoDelegate delegate){
        this.enderecoService = ServerCommunicationUtil.getInstance()
                .getRetrofit()
                .create(EnderecoService.class);

        this.delegate = delegate;
    }

    @Override
    protected Resposta<String> doInBackground(Endereco... parameters) {

        Call<Resposta<String>> call = enderecoService.salvarEndereco(parameters[0]);
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
            delegate.incluirEnderecoSucesso(resposta.getData());
        } else {
            delegate.incluirEnderecoFalha(resposta.getMessage());
        }
    }

    public interface IncluirEnderecoDelegate {
        public void incluirEnderecoSucesso(String token);
        public void incluirEnderecoFalha(String mensagem);
    }
}


