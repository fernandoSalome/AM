package br.com.fiap.beans;

public class Grupo {
private int idGrupo;
private String dsNome;

public String getAll() {
	return idGrupo + "\n" +
           dsNome ;
}

public void setAll(int idGrupo, String dsNome) {
	setIdGrupo(idGrupo);
	setDsNome(dsNome);

}

public Grupo(int idGrupo, String dsNome) {
	setIdGrupo(idGrupo);
	setDsNome(dsNome);

}

public Grupo() {}

public int getIdGrupo() {
	return idGrupo;
}
public void setIdGrupo(int idGrupo) {
	this.idGrupo = idGrupo;
}
public String getDsNome() {
	return dsNome;
}
public void setDsNome(String dsNome) {
	this.dsNome = dsNome;
}



}
