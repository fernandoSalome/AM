package br.com.fiap.beans;

public class Evento {
	private int idEvento;
	private Usuario idUsuario;
	private Topico idTopico;
	private String dtAbertura;
	private String dsEvento;
	private String dsNome;
	
	public String getAll() {
		return idEvento + "\n" + idUsuario.getIdUsuario() + "\n" + idTopico + "\n" + dtAbertura + "\n" + dsEvento + "\n" + dsNome;
	}
	public void setAll(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento, String dsNome) {		
		setIdEvento(idEvento);
		setIdUsuario(idUsuario);
		setIdTopico(idTopico);
		setDtAbertura(dtAbertura);
		setDsEvento(dsEvento);
		setDsNome(dsNome);
	}
	public Evento() {
		super();
	}
	public Evento(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento, String dsNome) {
		super();
		setIdEvento(idEvento);
		setIdUsuario(idUsuario);
		setIdTopico(idTopico);
		setDtAbertura(dtAbertura);
		setDsEvento(dsEvento);
		setDsNome(dsNome);
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Topico getIdTopico() {
		return idTopico;
	}
	public void setIdTopico(Topico idTopico) {
		this.idTopico = idTopico;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public String getDsEvento() {
		return dsEvento;
	}
	public void setDsEvento(String dsEvento) {
		this.dsEvento = dsEvento;
	}
	public String getDsNome() {
		return dsNome;
	}
	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}
	
	
}
