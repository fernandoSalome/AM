package br.com.fiap.beans;

public class Usuario {
 
  private int    idUsuario ;
  private String dsSenha;
  private int    dsTipo;
  private String dsNome;  	
  private String cpf;
  private String dtNascimento;
  private String dsEmail;
  private String fone;
  private Endereco endereco;
  
  
  


public String getAll() {
	  return idUsuario    + "\n" +
             dsSenha      + "\n" +
			 dsTipo       + "\n" +
             dsNome       + "\n" +			 
             cpf          + "\n" +
			 dtNascimento + "\n" +
             dsEmail      + "\n" +
			 fone      	  + "\n" +
             endereco.getAll();
             
  
  }
  
  public void setAll(int idUsuario, String dsSenha, int dsTipo, String dsNome, String cpf,
			String dtNascimento, String dsEmail, String fone, Endereco endereco) {
		 setIdUsuario(idUsuario);
		 setDsSenha(dsSenha);
		 setDsTipo(dsTipo);
		 setDsNome(dsNome);		 
		 setCpf(cpf);
		 setDtNascimento(dtNascimento);
		 setDsEmail(dsEmail);
		 setFone(fone);
		 setEndereco(endereco);
		 
		 
		 
	}
  
  
public Usuario(int idUsuario) {
	super();
	setIdUsuario(idUsuario);
}

public Usuario(int idUsuario, String dsSenha, int dsTipo, String dsNome, String cpf,
		String dtNascimento, String dsEmail, String fone, Endereco endereco) {
	 setIdUsuario(idUsuario);
	 setDsSenha(dsSenha);
	 setDsTipo(dsTipo);
	 setDsNome(dsNome);	 
	 setCpf(cpf);
	 setDtNascimento(dtNascimento);
	 setDsEmail(dsEmail);
	 setFone(fone);
	 setEndereco(endereco);
	 
	 
	 
}
public Usuario() {
	
}
public int getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}
public String getDsSenha() {
	return dsSenha;
}
public void setDsSenha(String dsSenha) {
	this.dsSenha = dsSenha;
}
public int getDsTipo() {
	return dsTipo;
}
public void setDsTipo(int dsTipo) {
	this.dsTipo = dsTipo;
}
public String getDsNome() {
	return dsNome;
}
public void setDsNome(String dsNome) {
	this.dsNome = dsNome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getDtNascimento() {
	return dtNascimento;
}
public void setDtNascimento(String dtNascimento) {
	this.dtNascimento = dtNascimento;
}
public String getDsEmail() {
	return dsEmail;
}
public void setDsEmail(String dsEmail) {
	this.dsEmail = dsEmail;
}
public String getFone() {
	return fone;
}
public void setFone(String fone) {
	this.fone = fone;
}
public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
  
  
  
  
}
