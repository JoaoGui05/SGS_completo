package com.example.sistemadeponto.network;

public class LoginResponse {
    private String token;
    private String tipo; // "funcionario" ou "gerente"
    private boolean sucesso;
    private String mensagem;

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isSucesso() { return sucesso; }
    public String getMensagem() { return mensagem; }
}
