package br.com.pointstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by FabricioMelo on 11/03/2017.
 */

public class Usuario {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String credito;
    private String email;
    private String login;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String sobrenome, String credito, String email, String cpf, String login, String senha) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.credito = credito;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
