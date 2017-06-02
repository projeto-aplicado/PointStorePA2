package br.com.pointstore.model;

/**
 * Created by Juan on 26/05/2017.
 */

public class MeusPontos {

    private Integer idMeusPontos;
    private String quantidade;
    private String loja;

    public MeusPontos (String loja, String quantidade ) {

        this.quantidade = quantidade;
        this.loja = loja;

    }
}
