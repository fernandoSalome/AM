package br.com.fiap.beans;

public class Entrega {
 
 private int      idEntrega;
 private Usuario  idUsuario;
 private String   dtEntrega;
 private String   dsPacote;
 private String   remetente;
 private int      entregasEspera;
  
 public String getAll() {
	 return idEntrega + "\n"+
            idUsuario.getIdUsuario() + "\n"+
			dtEntrega + "\n"+
            dsPacote + "\n"+
			remetente + "\n"+
            entregasEspera;
 }
 
 public void setAll(int idEntrega, Usuario idUsuario, String dtEntrega, String dsPacote, String remetente,
			int entregasEspera) {
	     setIdEntrega(idEntrega);
	     setIdUsuario(idUsuario);
	     setDtEntrega(dtEntrega);
	     setDsPacote(dsPacote);
	     setRemetente(remetente);
	     setEntregasEspera(entregasEspera);
	}
 
public Entrega(int idEntrega, Usuario idUsuario, String dtEntrega, String dsPacote, String remetente,
		int entregasEspera) {
     setIdEntrega(idEntrega);
     setIdUsuario(idUsuario);
     setDtEntrega(dtEntrega);
     setDsPacote(dsPacote);
     setRemetente(remetente);
     setEntregasEspera(entregasEspera);
}

public Entrega() {}

public int getIdEntrega() {
	return idEntrega;
}
public void setIdEntrega(int idEntrega) {
	this.idEntrega = idEntrega;
}
public Usuario getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Usuario idUsuario) {
	this.idUsuario = idUsuario;
}
public String getDtEntrega() {
	return dtEntrega;
}
public void setDtEntrega(String dtEntrega) {
	this.dtEntrega = dtEntrega;
}
public String getDsPacote() {
	return dsPacote;
}
public void setDsPacote(String dsPacote) {
	this.dsPacote = dsPacote;
}
public String getRemetente() {
	return remetente;
}
public void setRemetente(String remetente) {
	this.remetente = remetente;
}
public int getEntregasEspera() {
	return entregasEspera;
}
public void setEntregasEspera(int entregasEspera) {
	this.entregasEspera = entregasEspera;
}
 
 
}
