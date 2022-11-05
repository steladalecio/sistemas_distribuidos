package com.neogedom.exceptionhandling.model;

public class OlaMundo {
    private String saudacao;

    public OlaMundo(String nome) {
        this.saudacao = "Olá " + nome + "!";
    }

    public String getSaudacao() {
        return saudacao;
    }
}
