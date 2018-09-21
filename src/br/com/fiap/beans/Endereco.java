package br.com.fiap.beans;

public class Endereco {
	
	private int idEndereco;
	private String logradouro;
	private	String cidade;
	private int numero;
	private String estado;
	private String complemento;
	
	public String getAll() {
		return idEndereco + "\n" + logradouro + "\n" + cidade + "\n" + numero + "\n" + estado + "\n" + complemento;
	}
	public void setAll(int idEndereco, String logradouro, String cidade, int numero, String estado, String complemento) {		
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setCidade(cidade);
		setNumero(numero);
		setEstado(estado);
		setComplemento(complemento);
		
	}
	public Endereco() {
		super();
	}
	public Endereco(int idEndereco, String logradouro, String cidade, int numero, String estado, String complemento) {
		super();
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setCidade(cidade);
		setNumero(numero);
		setEstado(estado);
		setComplemento(complemento);
		
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
