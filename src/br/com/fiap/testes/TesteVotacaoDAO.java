package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Evento;
import br.com.fiap.beans.Usuario;
import br.com.fiap.beans.Votacao;
import br.com.fiap.dao.EventoDAO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.VotacaoDAO;
import br.com.fiap.execao.Execao;

public class TesteVotacaoDAO {
public static void main(String[] args) {
	try {
		VotacaoDAO votdao = new VotacaoDAO();
		Votacao vot = new Votacao();
		Evento evento = new Evento();
		Usuario us = new Usuario();
		EventoDAO eventodao = new EventoDAO();
		UsuarioDAO us = new UsuarioDAO();
		
		//criar votacao
		
		

	
	
	} catch(Exception e) {
		e.printStackTrace();
		System.out.println(Execao.tratarExecao(e));
	}finally {
		
	}
}
}
