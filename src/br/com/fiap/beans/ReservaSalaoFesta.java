package br.com.fiap.beans;

public class ReservaSalaoFesta {

private int        idReserva;
private Usuario    idUsuario;
private Cronograma idCronograma;
private String     dtReserva;
private String     dtHoraReserva;
 
public String getAll() {
	return idReserva 	+"\n"+
           idUsuario.getIdUsuario() 	+"\n"+
		   idCronograma.getAll()	+"\n"+
           dtReserva 	+"\n"+
           dtHoraReserva ;
}

public void setAll(int idReserva, Usuario idUsuario, Cronograma idCronograma, String dtReserva,
		  String dtHoraReserva) {
		 setIdReserva(idReserva);
		 setIdUsuario(idUsuario);
		 setIdCronograma(idCronograma);
		 setDtReserva(dtReserva);
		 setDtHoraReserva(dtHoraReserva);
		 
	}

public ReservaSalaoFesta(int idReserva, Usuario idUsuario, Cronograma idCronograma, String dtReserva,
	  String dtHoraReserva) {
	 setIdReserva(idReserva);
	 setIdUsuario(idUsuario);
	 setIdCronograma(idCronograma);
	 setDtReserva(dtReserva);
	 setDtHoraReserva(dtHoraReserva);
	 
}

public ReservaSalaoFesta() {}

public int getIdReserva() {
	return idReserva;
}
public void setIdReserva(int idReserva) {
	this.idReserva = idReserva;
}
public Usuario getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Usuario idUsuario) {
	this.idUsuario = idUsuario;
}
public Cronograma getIdCronograma() {
	return idCronograma;
}
public void setIdCronograma(Cronograma idCronograma) {
	this.idCronograma = idCronograma;
}
public String getDtReserva() {
	return dtReserva;
}
public void setDtReserva(String dtReserva) {
	this.dtReserva = dtReserva;
}
public String getDtHoraReserva() {
	return dtHoraReserva;
}
public void setDtHoraReserva(String dtHoraReserva) {
	this.dtHoraReserva = dtHoraReserva;
}


 

}
