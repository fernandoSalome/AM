package br.com.fiap.beans;

public class GrupoUsuario {
 private Usuario idUsuario;
 private Grupo idGrupo;
 

  public String getAll() {
	  return idUsuario.getIdUsuario() + "\n" +
             idGrupo.getIdGrupo();
  }
 
 public void setAll(Usuario idUsuario, Grupo idGrupo) {	  
	  setIdUsuario(idUsuario);
	  setIdGrupo(idGrupo);
	} 
 
 
public GrupoUsuario(Usuario idUsuario, Grupo idGrupo) {
  super();
  setIdUsuario(idUsuario);
  setIdGrupo(idGrupo);
}
public GrupoUsuario() {
	super();
}

public Usuario getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Usuario idUsuario) {
	this.idUsuario = idUsuario;
}
public Grupo getIdGrupo() {
	return idGrupo;
}
public void setIdGrupo(Grupo idGrupo) {
	this.idGrupo = idGrupo;
}
 
 
 
}
