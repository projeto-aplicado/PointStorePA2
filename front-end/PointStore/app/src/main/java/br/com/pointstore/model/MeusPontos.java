package br.com.pointstore.model;


public class MeusPontos{

	private Integer idMeusPontos;
	private String quantidade;
	private Loja loja;

	public MeusPontos (Loja Loja, String quantidade) {
		this.loja = loja;
		this.quantidade = quantidade;
	}

	public MeusPontos(String s, String s1) {
	}


	public Integer getIdMeusPontos() {
		return idMeusPontos;
	}

	public void setIdMeusPontos(Integer idMeusPontos) {
		this.idMeusPontos = idMeusPontos;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
