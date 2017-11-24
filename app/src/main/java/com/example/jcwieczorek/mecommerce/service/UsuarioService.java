package com.example.jcwieczorek.mecommerce.service;

import com.example.jcwieczorek.mecommerce.Models.Resposta;
import com.example.jcwieczorek.mecommerce.Models.Usuario;
import com.example.jcwieczorek.mecommerce.Models.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by jcwieczorek on 23/11/2017.
 */
public interface UsuarioService {

    @PUT("/usuario")
    public Call<Resposta<String>> salvarUsuario(@Body Usuario usuario);

    @POST
    public Call<Resposta<UsuarioResponse>> atualizarUsuario(@Body Usuario usuario, @Header("X-Token") String token);

}

