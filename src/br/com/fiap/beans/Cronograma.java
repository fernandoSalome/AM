package br.com.fiap.beans;

public class Cronograma {
private int    idCronograma;
private String dtData;

public String getAll() {
	return idCronograma + "\n" + 
           dtData;
}

public void setAll(int idCronograma, String dtData) {
	setIdCronograma(idCronograma);
	setDtData(dtData);
	
}

public Cronograma(int idCronograma, String dtData) {
	setIdCronograma(idCronograma);
	setDtData(dtData);
	
}
public Cronograma() {
	super();
}
public int getIdCronograma() {
	return idCronograma;
}
public void setIdCronograma(int idCronograma) {
	this.idCronograma = idCronograma;
}
public String getDtData() {
	return dtData;
}
public void setDtData(String dtData) {
	this.dtData = dtData;
}
  


}
