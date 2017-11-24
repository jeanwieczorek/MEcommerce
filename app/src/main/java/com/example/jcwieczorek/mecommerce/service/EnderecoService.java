package com.example.jcwieczorek.mecommerce.service;

import com.example.jcwieczorek.mecommerce.Models.Endereco;
import com.example.jcwieczorek.mecommerce.Models.EnderecoResponse;
import com.example.jcwieczorek.mecommerce.Models.Resposta;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by jcwieczorek on 23/11/2017.
 */

public interface EnderecoService {

    @PUT("/endereco")
    public Call<Resposta<String>> salvarEndereco(@Body Endereco endereco);

    @POST
    public Call<Resposta<EnderecoResponse>> atualizarEndereco(@Body Endereco endereco, @Header("X-Token") String token);

}