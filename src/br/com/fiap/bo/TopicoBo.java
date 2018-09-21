package br.com.fiap.bo;

import br.com.fiap.beans.Topico;

public class TopicoBo {
  
	public static String novoTopico(Topico tpc)throws Exception{
		
		if(tpc.getNomeCriador().length()>40) {
			return "Nome muito longo";
		}
	}
}
