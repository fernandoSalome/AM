package br.com.fiap.beans;

public class Topico {
	private int idTopico;
	private String nomeCriador;
	private String nomeTopico;
	
	public String getAll() {
		return idTopico + "\n" + nomeCriador + "\n" + nomeTopico;
	}
	public void setAll(int idTopico, String nomeCriador, String nomeTopico) {		
		setIdTopico(idTopico);
		setNomeCriador(nomeCriador);
		setNomeTopico(nomeTopico);
	}
	
	public Topico(int idTopico) {
		super();
		setIdTopico(idTopico);
	}
	public Topico() {
		super();
	}
	
	public Topico(int idTopico, String nomeCriador, String nomeTopico) {
		super();
		setIdTopico(idTopico);
		setNomeCriador(nomeCriador);
		setNomeTopico(nomeTopico);
	}
	public int getIdTopico() {
		return idTopico;
	}
	public void setIdTopico(int idTopico) {
		this.idTopico = idTopico;
	}
	public String getNomeCriador() {
		return nomeCriador;
	}
	public void setNomeCriador(String nomeCriador) {
		this.nomeCriador = nomeCriador;
	}
	public String getNomeTopico() {
		return nomeTopico;
	}
	public void setNomeTopico(String nomeTopico) {
		this.nomeTopico = nomeTopico;
	}
	

}
