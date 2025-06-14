package com.example.sistemadeponto.network;

import com.example.sistemadeponto.network.LoginRequest;
import com.example.sistemadeponto.network.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest request);

    @POST("/api/colaboradores'")
    Call<LoginResponse> loginFuncionario(@Body LoginRequest request);

    @POST("https://backendstartup.onrender.com/api/gerentes/registrar")
    Call<LoginResponse> loginGerente(@Body LoginRequest request);

    @POST("./routes/rotaRoutes")
    Call<LoginResponse> Ronda (@Body LoginRequest request);

}
