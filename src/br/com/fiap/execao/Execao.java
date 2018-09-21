package br.com.fiap.execao;

public class Execao {
 public static String tratarExecao(Exception e) {
	 if(e.getClass().getName().equals("java.lang.NumberFormatException")) {
		 return "numero invalido";
	 }
	 else if(e.getClass().getName().equals("java.sql.SQLException")) {
			return "N�o foi poss�vel conectar no banco";
		}else {
			return "Deu ruim!";
		}
 }
}
