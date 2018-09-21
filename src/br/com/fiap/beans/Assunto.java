package br.com.fiap.beans;

public class Assunto extends Evento{
	private int idAssunto;
	private String dsAssunto;
	
		
	public void setAll(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento, String dsNome,
			int idAssunto, String dsAssunto) {
		super.setAll(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);
		setIdAssunto(idAssunto);
		setDsAssunto(dsAssunto);
	}
	public Assunto(int idAssunto, String dsAssunto) {
		super();
		setIdAssunto(idAssunto);
		setDsAssunto(dsAssunto);
	}

	public Assunto() {
		super();
	}
	
	public Assunto(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento, String dsNome,
			int idAssunto, String dsAssunto) {
		super(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);
		this.idAssunto = idAssunto;
		this.dsAssunto = dsAssunto;
	}


	public int getIdAssunto() {
		return idAssunto;
	}
	public void setIdAssunto(int idAssunto) {
		this.idAssunto = idAssunto;
	}
	public String getDescricao() {
		return dsAssunto;
	}
	public void setDsAssunto(String dsAssunto) {
		this.dsAssunto = dsAssunto;
	}
	
	
	
}
