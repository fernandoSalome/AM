package br.com.fiap.beans;

public class Reclamacao extends Evento{
	private int idReclamacao;
	private String nomeAdm;
	private String nomeUsuario;
	private String imagem;
	
	public Reclamacao() {
		super();
	}
	
	public void setAll(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento,
			String dsNome, int idReclamacao, String nomeAdm, String nomeUsuario, String imagem) {
		super.setAll(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);;
		this.idReclamacao = idReclamacao;
		this.nomeAdm = nomeAdm;
		this.nomeUsuario = nomeUsuario;
		this.imagem = imagem;
	}
	
	public Reclamacao(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento,
			String dsNome, int idReclamacao, String nomeAdm, String nomeUsuario, String imagem) {
		super(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);
		this.idReclamacao = idReclamacao;
		this.nomeAdm = nomeAdm;
		this.nomeUsuario = nomeUsuario;
		this.imagem = imagem;
	}
	
	public int getIdReclamacao() {
		return idReclamacao;
	}
	public void setIdReclamacao(int idReclamacao) {
		this.idReclamacao = idReclamacao;
	}
	public String getNomeAdm() {
		return nomeAdm;
	}
	public void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
